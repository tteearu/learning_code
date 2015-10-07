# from string import maketrans

import requests


f = requests.get("http://www.pythonchallenge.com/pc/def/ocr.html")

for line in f.readlines():
	print line


# normalAlphabet = "abcdefghijklmnopqrstuvwxyz"
# caesar = "cdefghijklmnopqrstuvwxyzab"
# trantap = maketrans(normalAlphabet, caesar)


# url = "map"

# print url.translate(trantap)