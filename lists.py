#Trying out commands that can be performed on lists
    N = int(input())
    slist=[]

    for w in range(0,N):
        s = input()
        d=s.split()
        command = d[0]
        if command == 'print':
            print (slist)


        elif command == 'insert':
            i = int(d[1])
            e = int(d[2])
            slist.insert(i,e)
          


        elif command == 'remove':

            e = int(d[1])
            slist.remove(e)
        elif command == 'append':
            e = int(d[1])
            slist.append(e)

        elif command == 'sort':
            slist.sort()

        elif command == 'pop':
            slist.pop()

        elif command == 'reverse':
            slist.reverse()
