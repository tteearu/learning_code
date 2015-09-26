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
		# reversed_list = []
		# 	for row in self.board_list:
		# 		reversed_list.append([])

		# 	for n in range(len(self.board_list)):
		# 		reversed_list[n][n] = self.board_list[n][n]

		pass

	def downkey(self):
		# print "downkey"
		pass
	def leftkey(self):
		for n in range(len(self.board_list)):
			self.board_list[n] = [x for x in self.board_list[n] if x != 0]
			try:
				for i in range(len(self.board_list[n])-1):
					if self.board_list[n][i+1] == self.board_list[n][i]:
						self.board_list[n][i] = self.board_list[n][i] * 2
						del self.board_list[n][i+1]
			except:
				pass
			while len(self.board_list[n]) != 4:
				self.board_list[n].append(0)

	def rightkey(self):
		for n in range(len(self.board_list)):
			self.board_list[n] = [x for x in self.board_list[n] if x != 0]
			try:
				for i in range(len(self.board_list[n])-1):
					if self.board_list[n][i+1] == self.board_list[n][i]:
						self.board_list[n][i] = self.board_list[n][i] * 2
						del self.board_list[n][i+1]
			except:
				pass
			while len(self.board_list[n]) != 4:
				self.board_list[n].insert(0,0)

	def generate_newpiece(self):
		x = randrange(0,4)
		y = randrange(0,4)
		newvalue = randrange(2,6,2)

		while self.board_list[x][y] != 0:
			x = randrange(0,4)
			y = randrange(0,4)
		else:
			self.board_list[x][y] = newvalue

	# def moveleft(self):