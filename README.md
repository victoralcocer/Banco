# banco
Creamos un banco y simulamos un sistema financiero.<br>
<h2>Banco</h2>

La clase banco tiene:
un array de Cuentas (de cualquier tipo, normal, ahorro o de crédito)<br>
<li>Un código de exactamente 4 números no modificable que identifica al banco</li>
<li>Un array de cuentas de morosos</li><br>
El banco puede:<br><br>
<li>aplicar el interés a las cuentas de ahorro que tenga</li>
<li>actualizar su lista de morosos: si detecta cuentas con saldo < 0, las añade a la lista de morosos y saca un aviso por pantalla. Si hay cuentas en lista de morosos que estén en positivo, salen de la lista de morosos.</li>
<li>eliminar morosos: si el banco tiene morosos, elimina esas cuentas de su listado de cuentas</li>
