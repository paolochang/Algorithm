class Solution:
    # Iteration
    # Time Complexity: BigO(N)
    # Space Complexity: BigO(1)
    def interpret(self, command: str) -> str:
        res = ''
        tmp = ''
        for i, val in enumerate(command):
            if val == 'G':
                res += 'G'
                continue
            tmp += val
            if tmp == '(al)':
                res += 'al'
                tmp = ''
            elif tmp == '()':
                res += 'o'
                tmp = ''
        return res

    # Iteration
    # Time Complexity: BigO(N)
    # Space Complexity: BigO(1)
    def interpret(self, command: str) -> str:
        command = command.replace('()', 'o')
        command = command.replace('(', '')
        command = command.replace(')', '')
        return command
