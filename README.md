# Práctica 09 - Menú de navegación inferior

**Instrucciones**: Desarrolle una aplicación móvil en plataforma Android, utilizando menú de navegación inferior para un **tienda departamental**.

El diseño de la aplicación contempla la Activity principal donde se tiene el menú de navegación interior (Bottom Navigation Views, con tres apartados) que tendrá las opciones: *Nosotros, Galería, Crédito*. La opción Nosotros será para describir información sobre la tienda (utilice imágenes para representar el personal y logo de la empresa -ficticia), así como un botón con la leyenda "Página oficial". La opción Galería corresponde a mostrar una serie de imágenes de distintas prendas  (al menos 6). La opción Crédito corresponde a mostrar un formulario para agendar una cita, se incluye un calendario.

La funcionalidad con respecto a cada Activity se detalla a continuación:
* ***Nosotros***. Dentro de ésta opción se reproduce un video promocional. Un video corto, representativo.
* ***Galería***: Se despliega una listado de imágenes correspondientes a imágenes representativas. Al dar clic sobre la imagen, debe mostrar otra Activity donde se muestran detalles de la prenda.
* ***Crédito***: Se debe visualizar el formulario para capturar datos del cliente, utilizando un calendario donde se defina la fecha de cita. El registro de la información se muestra dentro de un Toast. Aplique el componente Calendar View para la implementación del calendario dentro del formulario.
* Aplique el uso de recursos gráficos (imágenes y video) para la apariencia de la aplicación.
