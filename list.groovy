def list = [1, 2, 3, 4] + 5
list = list + 5
println list

list = list.unique()
println list
list.each {
    println it
}

def strlist = "1,2,3,4"
def strlist2 ="5,6,7,8"
lists= strlist.tokenize(',')
lists2= strlist2.tokenize(',')
lists = lists+lists2
lists.each{
    println it
}