import socket
s=socket.socket(socket.AF_INET,socket.SOCK_STREAM)
s.bind((socket.gethostname,1234))
s.listen(5)
while True:
    clt,adr=s.accept()
    print(f"connection to {adr} achieved")
    clt.send(bytes("Programming in Python","utf-8"))