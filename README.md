# Staffoff-On
# StaffPrefixscript

Un script simple para servidores de Minecraft que permite a los miembros del staff activar o desactivar un prefijo visible en su nombre.

## ✨ Características

- Comando `/staffon`: Agrega el prefijo `[Helper]` al nombre del jugador.
- Comando `/staffoff`: Quita el prefijo, restaurando el nombre original.
- Control de permisos: Solo los jugadores con el permiso `staff.use` pueden usar estos comandos.

## ⚙️ Instalación

1. Compila el plugin y coloca el `.jar` en la carpeta `plugins/` de tu servidor Spigot/Paper.
2. Reinicia el servidor o usa `/reload`.
3. Asegúrate de dar el permiso `staff.use` al grupo de staff en tu sistema de permisos (LuckPerms, PermissionsEx, etc).

## 📜 Permisos

| Permiso     | Descripción                               |
|-------------|-------------------------------------------|
| `staff.use` | Permite usar `/staffon` y `/staffoff`     |

## 🧪 Comandos

| Comando       | Descripción                            |
|---------------|----------------------------------------|
| `/staffon`    | Activa el prefijo `[Helper]`           |
| `/staffoff`   | Desactiva el prefijo y muestra el nombre original |

## 🧩 Ejemplo de uso

```text
@jugador escribe: /staffon
→ Su nombre se mostrará como [Helper] Jugador
