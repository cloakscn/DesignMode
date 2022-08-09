# 电子商务应用中的支付方法
在本例中， 策略模式被用于在电子商务应用中实现各种支付方法。 客户选中希望购买的商品后需要选择一种支付方式： Paypal 或者信用卡。

具体策略不仅会完成实际的支付工作， 还会改变支付表单的行为， 并在表单中提供相应的字段来记录支付信息。
# 执行结果
```text
Please, select a product:
1 - Mother board
2 - CPU
3 - HDD
4 - Memory
1
Count: 2
Do you wish to continue selecting products? Y/N: y
Please, select a product:
1 - Mother board
2 - CPU
3 - HDD
4 - Memory
2
Count: 1
Do you wish to continue selecting products? Y/N: n
Please, select a payment method:
1 - PalPay
2 - Credit Card
1
Enter the user's email: user@example.com
Enter the password: qwerty
Wrong email or password!
Enter user email: amanda@ya.com
Enter password: amanda1985
Data verification has been successful.
Pay 6250 units or Continue shopping?  P/C: p
Paying 6250 using PayPal.
Payment has been successful.
```