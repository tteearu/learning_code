import sys, csv

filenames = ["Filename:"]
lines =["No. of lines"]
wordslengths = ["No. of words:"]
chars = ["No. of chars:"]
firstword = ["Most popular word:"]

def most_common(lst):
    return max(set(lst), key=lst.count)

def count_common(lst):
	return lst.count(most_common(lst))

for item in sys.argv[1:]:
	filenames.append(item)
	num_lines = 0
	num_words = 0
	num_chars = 0
	all_words = []
	most_common_word = []
	with open(item, "r") as f:
		for line in f:
			words = line.split()
			num_lines += 1
			num_words += len(words)
			num_chars += len(line)

			for word in words:
				all_words.append(word)


	lines.append(num_lines)
	wordslengths.append(num_words)
	chars.append(num_chars)
	firstword.append("%s(%r)" % (most_common(all_words), count_common(all_words)) )


print ",".join(filenames)
# print ",".join(lines)
# print ",".join(wordslengths)
# print ",".join(chars)
print ",".join(firstword)


with open('output.csv', 'wb') as myfile:
    wr = csv.writer(myfile)
    wr.writerow(filenames)
    wr.writerow(lines)
    wr.writerow(wordslengths)
    wr.writerow(chars)
    wr.writerow(firstword)
