println 'Hello'
def a = 'hello'
println a.length()

name = 'helloworld'
println name.contains('world')
println name.endsWith('ld')
str1 = 'dev' + 'ops'
println str1.toUpperCase()
println str1.toLowerCase()
str2 = 'host01,host02,host03'
hosts = str2.split(',')
for (i in hosts) {
    println(i)
}

name = "jks"
println("hello ${name}")
println('hello ${name}')