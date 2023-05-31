# SI_lab2_183164
## Дамјна Панџаров, број на индекс: 183164 ##

# Control Flow Graph #
![Control Flow Graph](https://cdn.discordapp.com/attachments/1010152508611625002/1113570688335351848/img.png)

# Цикломатска комплексност #
Главниот пат на извршување е линијата 19, каде што се врши проверка дали постои User објект и дали password и email се null. Ако оваа проверка врати true, се фрли RuntimeException, што го завршува извршувањето на функцијата.

# Тест случаи според критериумот EveryBranch #

1. Тест случај кога user е null:

Влезни податоци: user = null
Очекуван резултат: RuntimeException со порака "Mandatory information missing!"

2. Тест случај кога user не е null, но password и email се null:

Влезни податоци: user = new User("username", null, null)
Очекуван резултат: RuntimeException со порака "Mandatory information missing!"

3. Тест случај кога user не е null, password и email не се null, и username е null:

Влезни податоци: user = new User(null, "password", "email@example.com")
Очекуван резултат: user.getUsername() ќе биде поставен на "email@example.com"

4. Тест случај кога user не е null, password и email не се null, и username не е null:

Влезни податоци: user = new User("username", "password", "email@example.com")
Очекуван резултат: user.getUsername() ќе биде "username"

5. Тест случај кога password го содржи username и password има должина помала од 8:

Влезни податоци: user = new User("username", "passusername", "email@example.com")
Очекуван резултат: false

6. Тест случај кога password го содржи username, но password има должина поголема или еднаква на 8:

Влезни податоци: user = new User("username", "passwordusername", "email@example.com")
Очекуван резултат: true

7. Тест случај кога password не го содржи username и password има должина помала од 8:

Влезни податоци: user = new User("username", "pass", "email@example.com")
Очекуван резултат: false

8. Тест случај кога password не го содржи username, должината на password е поголема или еднаква на 8 и password не содржи посебни знаци:

Влезни податоци: user = new User("username", "validpassword", "email@example.com")
Очекуван излез: false

9. Тест случај кога password не го содржи username, должината на password е помала од 8 и password содржи посебен знак:

Влезни податоци: user = new User("username", "password!", "email@example.com")
Очекуван излез: true

10. Тест случај кога password не го содржи username, должината на password е поголема или еднаква на 8 и password содржи посебен знак:

Влезни податоци: user = new User("username", "validpassword!", "email@example.com")
Очекуван излез: true


# Тест случаи според критериумот MultipleCondition #

1. Тест случај кога сите услови се true:

Влезни податоци: user = null, user.getPassword() = null, user.getEmail() = null
Очекуван резултат: true

2. Тест случај кога првиот услов е false, а вториот и третиот услов се true:

Влезни податоци: user != null, user.getPassword() = null, user.getEmail() = null
Очекуван резултат: true

3. Тест случај кога првиот услов е true, а вториот и третиот услов се false:

Влезни податоци: user = null, user.getPassword() != null, user.getEmail() != null
Очекуван резултат: true

4. Тест случај кога сите услови се false:

Влезни податоци: user != null, user.getPassword() != null, user.getEmail() != null
Очекуван резултат: false

5. Тест случај кога првиот и вториот услов се false, а третиот услов е true:

Влезни податоци: user != null, user.getPassword() != null, user.getEmail() = null
Очекуван резултат: false

6. Тест случај кога првиот и третиот услов се false, а вториот услов е true:

Влезни податоци: user = null, user.getPassword() != null, user.getEmail() != null
Очекуван резултат: false

7. Тест случај кога првиот услов е true, а вториот и третиот услов се false:

Влезни податоци: user = null, user.getPassword() = null, user.getEmail() != null
Очекуван резултат: false

8. Тест случај кога сите услови се false, освен третиот услов:

Влезни податоци: user != null, user.getPassword() != null, user.getEmail() = null
Очекуван резултат: false



