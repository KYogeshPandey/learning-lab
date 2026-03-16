import requests

response = requests.get("https://www.youtube.com/")
print(response.status_code)
print(response.text)    