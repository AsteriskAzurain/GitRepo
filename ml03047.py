def wordCount(data):
    re={}
    for i in data:
        re[i]=re.get(i,0)+1  #返回指定键的值 若无 返回0(默认返回值None)
    return re

if __name__=="__main__":
    f=open('Shakespeare Sonnet.txt')
    stri=""
    for line in f.readlines():
        stri+=line
    print(wordCount(stri))
    f.close()
