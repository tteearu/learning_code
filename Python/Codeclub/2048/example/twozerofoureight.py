from arrows import Arrow
from random import randrange
import os

def cls():
    os.system(['clear','cls'][os.name == 'nt'])

class board:
	board_list = []

	def __init__(self):
		for i in range(0,4):
			self.board_list.append([0,0,0,0])

	def print_board(self):
		cls()
		for row in self.board_list:
			print row

	def upkey(self):
	# print "upkey"
		pass
	def downkey(self):
	# print "downkey"
		pass
	def leftkey(self):
		pass
	def rightkey(self):
	# print "rightkey"
		pass

	def generate_newpiece(self):
		x = randrange(0,4)
		y = randrange(0,4)
		newvalue = randrange(2,6,2)

		while self.board_list[x][y] != 0:
			x = randrange(0,4)
			y = randrange(0,4)
		else:
			self.board_list[x][y] = newvalue

	def moveleft(self):
		

	

