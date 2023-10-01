# banco
Creamos un banco y simulamos un sistema financiero.<br>
<h2>Banco</h2>

La clase banco tiene:
un array de Cuentas (de cualquier tipo, normal, ahorro o de crédito)
Un código de exactamente 4 números no modificable que identifica al banco
Un array de cuentas de morosos
El banco puede:
aplicar el interés a las cuentas de ahorro que tenga
actualizar su lista de morosos: si detecta cuentas con saldo < 0, las añade a la lista de morosos y saca un aviso por pantalla. Si hay cuentas en lista de morosos que estén en positivo, salen de la lista de morosos.
eliminar morosos: si el banco tiene morosos, elimina esas cuentas de su listado de cuentas
