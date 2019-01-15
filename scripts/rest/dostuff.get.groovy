def result = [:]

def value = (params.myValue) ? params.myValue : "Default"

result.aValue = value
result.sum = 10 + 20

return result