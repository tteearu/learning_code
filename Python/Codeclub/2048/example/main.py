from twozerofoureight import *

game_board = board()
	
	

game_board.generate_newpiece()
game_board.generate_newpiece()
game_board.print_board()

def play():
	key = Arrow.input()
	while key != Arrow.NONE:
			# print(key)
			if key == Arrow.UP:
				game_board.upkey()
				game_board.generate_newpiece()
				game_board.print_board()
			elif key == Arrow.DOWN:
				game_board.downkey()
				game_board.generate_newpiece()
				game_board.print_board()
			elif key == Arrow.LEFT:
				game_board.leftkey()
				game_board.generate_newpiece()
				game_board.print_board()
			elif key == Arrow.RIGHT:
				game_board.rightkey()
				game_board.generate_newpiece()
				game_board.print_board()		
			key = Arrow.input()

	print("None of the arrow keys was pressed")


if __name__ == "__main__":
	play()
