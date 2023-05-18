def module2_division(dividend, divisor):
    dividend_len = len(dividend)
    divisor_len = len(divisor)
    quotient = []

    for i in range(dividend_len - divisor_len + 1):
        if dividend[i] == '1':
            for j in range(divisor_len):
                dividend[i + j] = str(int(dividend[i + j]) ^ int(divisor[j]))
            quotient.append('1')
        else:
            quotient.append('0')

    return ''.join(quotient), ''.join(dividend[-divisor_len+1:])

# Example usage
dividend = list("1011101")  # Binary representation of the dividend
divisor = list("1101")     # Binary representation of the divisor

quotient, remainder = module2_division(dividend, divisor)

print("Quotient:", quotient)
print("Remainder:", remainder)
