def prime(x, y):
    prime_list=[]
    for i in range(x, y):
        if (i==0 or i==1):
            continue
        else:
            for j in range(2, int(i/2)+1):
                if (i%j ==0):
                    break
                else:
                    prime_list.append(i)
    return prime_list

starting_range=int(input("Enter the starting number= "))
ending_range=int(input("Enter the ending number= "))
ist=prime(starting_range, ending_range)
if (len(ist)==0):
    print("No prime numbers in this range")
else:
    print("The prime numbers in the range are: ", ist)