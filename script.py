import requests

# Ruta del archivo
file_path = "/Users/SSD/Descargas/Enemigos.txt"

# Servidor donde correrá la API en Java
API_URL = "http://localhost:8080"

# Leer archivo línea por línea
with open(file_path, "r", encoding="utf-8") as file:
    
    next(file)  # Saltar la primera línea (cabecera)
    
    for line in file:
        # Separar por "|"
        data = line.strip().split("|")

        if len(data) != 7:
            print(f"Formato incorrecto en línea: {line}")
            continue

        potencia, hostilidad, ubicacion, frente, numero_tropas, tipo_tropas, hora_despliegue = map(str.strip, data)

        # Enviar datos a /enemigos
        response1 = requests.post(f"{API_URL}/api/v1/Potencia/enemigos", json={
            "potencia": potencia,
            "hostilidad": hostilidad,
            "ubicacion": ubicacion
        })
        print(f"Enviado a /enemigos: {response1.status_code}")

        # Enviar datos a /tropas
        response2 = requests.post(f"{API_URL}/api/v1/Tropa/tropas", json={
            "potencia": potencia,
            "frente": frente,
            "numero_tropas": int(numero_tropas),
            "tipo_tropas": tipo_tropas,
            "hora_despliegue": hora_despliegue
        })
        print(f"Enviado a /tropas: {response2.status_code}")
