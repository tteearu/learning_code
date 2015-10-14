from datetime import datetime
import os, time

def cls():
    os.system(['clear','cls'][os.name == 'nt'])

timelist = []

def append(base):
	try:
		timelist.append(int(base[0:1]))
	except:
		timelist.append(0)
	try:
		timelist.append(int(base[1:2]))
	except:
		timelist.append(0)


def settime():
	dt = datetime.now()

	append(str((datetime.strptime("%r" % dt.hour, "%H" )).strftime("%I")))
	append(str((datetime.strptime("%r" % dt.minute, "%M" )).strftime("%M")))
	append(str((datetime.strptime("%r" % dt.second, "%S" )).strftime("%S")))


def printlist(binarylist):
	for number in binarylist:
		if number == 0:
			print "0000\t0"
		else:
			print bin(number)[2:].zfill(4)+"\t%r" % number

while True:
	start_time = time.time()
	timelist= []
	settime()
	cls()
	printlist(timelist)
	time.sleep(1-(time.time()-start_time))