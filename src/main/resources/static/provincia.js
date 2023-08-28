document.addEventListener("DOMContentLoaded", function() {
    const form = document.getElementById("provinceForm");
    const messageDiv = document.getElementById("message");

    form.addEventListener("submit", function(event) {
        event.preventDefault();

        const provinceName = document.getElementById("provinceName").value;

        // Crear un objeto para el cuerpo de la petición POST
        const provincia = {
            pro_nombre: provinceName
        };

        // Realizar la petición POST utilizando fetch
        fetch("/api/provincias", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(provincia)
        })
        .then(response => response.json())
        .then(data => {
            messageDiv.textContent = `Provincia "${data.nombre}" dada de alta correctamente.`;
        })
        .catch(error => {
            console.error("Error al realizar la petición:", error);
            messageDiv.textContent = "Hubo un error al dar de alta la provincia.";
        });
    });
});
