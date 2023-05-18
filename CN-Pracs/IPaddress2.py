import ipaddress

def print_network_details(ip_address):
    # Parse the IP address and determine the network details
    ip = ipaddress.IPv4Address(ip_address)
    network = ipaddress.IPv4Network(ip_address + '/24', strict=False)

    # Print the network details
    print("IP Address: ", ip_address)
    print("Network Address: ", network.network_address)

    # Determine the class based on the first octet
    first_octet = int(ip_address.split('.')[0])
    if 1 <= first_octet <= 127:
        network_class = 'A'
        subnet_mask = '255.0.0.0'
    elif 128 <= first_octet <= 191:
        network_class = 'B'
        subnet_mask = '255.255.0.0'
    elif 192 <= first_octet <= 223:
        network_class = 'C'
        subnet_mask = '255.255.255.0'
    elif 224 <= first_octet <= 239:
        network_class = 'D'
        subnet_mask = 'N/A'
    else:
        network_class = 'E'
        subnet_mask = 'N/A'
    print("Class: ", network_class)
    print("Subnet Mask: ", subnet_mask)

    # Calculate and print the broadcast address
    host_bits = 32 - network.prefixlen
    broadcast_address = ipaddress.IPv4Address(int(ip) | (2**host_bits - 1))
    print("Broadcast Address: ", broadcast_address)

# Take input IP address from the user
ip_address = input("Enter IP address: ")

# Print the network details
print_network_details(ip_address)
