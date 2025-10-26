/* 
 NETWORK PARAMETERS

IP Address (Logical Address):
Every device on the internet is assigned logical address allowing it to establish communication at as required on a field of system. This act as a byte.

Static IP address: An IP address which is fixed & remains the same each change of device.

Dynamic IP address: IP address are assigned dynamically to the device getting connected to network.
These are not permanent.

MAC Address (Physical Address):
It is a unique unifield assigned to a network interface card (NIC) or Network Adapter. It is unique to specific device allowing it to be identified on a network.
IT IS A 48-bit address represented in hexadecimal format.

Default Gateway:
It is a device or a router that serve as the last point of traffic leaving a local network to access the internet or other wider network.

Routing Table:
Database which holds information about the data packets transfer, neighbouring nodes and overall network. Helps in best path selection maintaining routing of data packets.

Ethernet Statistics:
Refers to the metrics collected about Ethernet network traffic, performance and errors. They keep track of data packets sent and dropped, collided, errors, delays and also the information about troubleshooting issues.

Subnet Mask:
It is a 32-bit number that helps to determine scope of the network and subnetwork within a larger network.
Helps division of IP into 2 parts: Network Address and Host Address.
*/

/*A. Use appropriate tool to find Host name, IP address, physical address, 
subnet mask, default gateway etc [hint: Ipconfig]. Explore different options 
available with the tool.
ANS:
Tool: ipconfig (Windows), ifconfig/ip addr (Linux)
Explore system options available with the tool.

To display the host name:
hostname : This prints given computer name on next line.

To display IP address, MAC address and subnet mask :
ipconfig : Displays all information of all devices on local network.
ip addr : shows the ip address.

To display the default gateway :
ip route : Displays the routing table with IP address of gateway.

OUTPUT EXAMPLE (Windows):
hostname
hostname-I

ipconfig
10.34.20.48

getmac
SC-EC-1B-D7-9D-3E

Sub-net mask
eth0 255.255.255.0
lo 255.0.0.0

ip route
default via 10.34.20.1

(default gateway – another’s IP address)
*/


/*B. On the host system, identify the TCP connections, ports on which the 
computer is listening, Ethernet statistics, the IP routing table, 
IPV4statistics, and IPV4 statistics etc. using appropriate tool [hint: netstat]. 
Explore different options available with the tool. 
ANS:
To show all connections : netstat -a

To show only TCP connections :
netstat -at or netstat -at

To show only UDP ports :
netstat -au or netstat -au

To show the routing table :
netstat -rn

To show IPV4 and IPV6 statistics :
netstat -s (IPV4)
netstat -s -6 (IPV6)

Output :

Routing table
Active routes :

Active Destination	Network	Gateway	Interface	Metric

0.0.0.0	0.0.0.0	192.0.20.1	255.255.255.255	331
10.34.80.0	0.0.0.0	On-link	10.0.0.0	331


IPv4 Statistics

Packets received : 39388
Received header errors : 0
Received address errors : 0
Datagrams forwarded : 0
Unknown protocols received : 111
Received packets discarded : 30323
Received packets delivered : 38323
Output packet no route : 6

IPv6 Statistics

Packets received : 0
Received header errors : 0
Datagrams forwarded : 0
Received packets discarded : 0
Received packets delivered : 24
Output packet no route : 0
*/