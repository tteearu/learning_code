class Calculator:
	def calculate(self, input_string):
		tehe = []
		operators = ['+','-','*','/']
		result = 0
		temp = ""
		special = ['*','/']

		for x in input_string:
			if x in operators:
				try:
					tehe.append(float(temp))
				except ValueError:
					pass	
				tehe.append(x)
				temp = ""
			else:
				temp += x
		tehe.append(float(temp))

		multiplications = tehe.count('*')
		divisions = tehe.count('/')
		
		while multiplications > 0:
			position = tehe.index('*')
			if tehe[position-2] not in special:
				korrutis = tehe[position-1] * tehe[position+1]
				del tehe[position-1:position+2]
				tehe.insert(position-1,korrutis)
				multiplications -= 1
			else:
				position = tehe.index('/')
				if tehe[position-2] not in special:
					jagatis = tehe[position-1] / tehe[position+1]
					del tehe[position-1:position+2]
					tehe.insert(position-1,jagatis)
					divisions -= 1	

		while divisions > 0:
			position = tehe.index('/')
			if tehe[position-2] not in special:
				jagatis = tehe[position-1] / tehe[position+1]
				del tehe[position-1:position+2]
				tehe.insert(position-1,jagatis)
				divisions -= 1
			else:
				pass
		
		while len(tehe) > 0:
			for x in tehe:
				if x not in operators:
					position = tehe.index(x)
					if position == 0:
						result += x
						del tehe[0]
					elif tehe[position-1] == "+":
						result += x
						del tehe[position-1:position+1]
					elif tehe[position-1] == "-":
						result -= x
						del tehe[position-1:position+1]

		return result