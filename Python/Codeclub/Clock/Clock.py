
class Clock():

	def __init__(self):
		pass

	def calculateAngle(self, timestring):
		timelist = map(int, timestring.split(":"))
		if timelist[1] > 60:
			raise BaseException("VALE")

		print abs(timelist[0]*30 - timelist[1]*6)

	def calculateTime(self, angle):
		for i in range(12):
			minutes = ((angle+ (i * 30))/6)

			if minutes > 59:
				minutes -= 60

			print "%02d:%02d" % (i, minutes)

	def returnTime(self, hourangle,minuteangle):

		hour = hourangle / 30
		minute = minuteangle / 6

		print "%02d:%02d" % (hour, minute)
