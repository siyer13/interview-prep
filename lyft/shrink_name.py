def shrink_name(name):
    middle_name = ''
    if len(name.split()) <=2 :
        print name
        return name
    else:
        split_name = name.split()
        words = len(split_name)
        for i in range(1,words-1):
            middle_name = middle_name + split_name[i][:1] + '.'
        full_name = str(split_name[0]) + ' ' + str(middle_name) + ' ' + str(split_name[words-1])
        print full_name
        return full_name


shrink_name('Alan Smith')
shrink_name('Sridhar Ramakrishnan Iyer')
shrink_name('Sridhar Ramakrishnan Ponani Ganapathy Iyer')
shrink_name('Sridhar')
