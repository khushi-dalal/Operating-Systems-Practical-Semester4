import socket

# Create a socket object
s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

# Define the server address and port
server_address = ('localhost', 12345)

# Bind the socket to the server address
s.bind(server_address)

# Listen for incoming connections
s.listen(1)

print("Server is listening on", server_address)

while True:
    # Wait for a client connection
    print("Waiting for a client connection...")
    client_socket, client_address = s.accept()
    print("Connected to client:", client_address)

    try:
        # Receive data from the client
        data = client_socket.recv(1024)
        print("Received from client:", data.decode())

        # Send a response back to the client
        message = "Hello, client!"
        client_socket.sendall(message.encode())

    finally:
        # Close the client connection
        client_socket.close()
