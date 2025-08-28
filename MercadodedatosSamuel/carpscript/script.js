const precios = {
  MANZANA: 1.0,
  PERA: 1.2,
  PLATANO: 0.5,
  NARANJA: 0.8
};

const ventas = {
  MANZANA: 0,
  PERA: 0,
  PLATANO: 0,
  NARANJA: 0
};

const historial = [];

document.getElementById("formularioCompra").addEventListener("submit", function (e) {
  e.preventDefault();

  const cliente = document.getElementById("cliente").value.trim();
  const fruta = document.getElementById("fruta").value;
  const monto = parseFloat(document.getElementById("monto").value);

  if (!cliente || isNaN(monto) || monto <= 0) {
    alert("Por favor, introduce todos los datos correctamente.");
    return;
  }

  const precio = precios[fruta];
  const unidades = Math.floor(monto / precio);

  if (unidades < 1) {
    alert("Con ese monto no puedes comprar ni una unidad.");
    return;
  }

  // Registrar venta
  ventas[fruta] += unidades;
  historial.push(`${cliente} compró ${unidades} ${fruta.toLowerCase()}(s) por ${monto.toFixed(2)}€`);

  actualizarHistorial();
  actualizarVentas();
  document.getElementById("formularioCompra").reset();
});

function actualizarHistorial() {
  const ul = document.getElementById("historial");
  ul.innerHTML = "";
  historial.forEach(item => {
    const li = document.createElement("li");
    li.textContent = item;
    ul.appendChild(li);
  });
}

function actualizarVentas() {
  const ul = document.getElementById("ventasTotales");
  ul.innerHTML = "";
  for (const fruta in ventas) {
    const li = document.createElement("li");
    li.textContent = `${fruta}: ${ventas[fruta]} unidades vendidas`;
    ul.appendChild(li);
  }
}
