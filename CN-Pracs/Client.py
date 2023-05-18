import socket

# Create a socket object
s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

# Define the server address and port
server_address = ('localhost', 12345)

# Connect to the server
s.connect(server_address)

try:
    # Send data to the server
    message = input('Enter your message: ')
    s.sendall(message.encode())

    # Receive data from the server
    data = s.recv(1024)
    print("Received from server:", data.decode())

finally:
    # Close the connection
    s.close()
