require libv3ddriver.inc

SRC_URI[dm7080.md5sum] = "2f42d69868370432539fbfbf53bba820"
SRC_URI[dm7080.sha256sum] = "0534ccc4760b47559b5003680e5e372d43ab659af214030961d99ff4c367a401"

PRECOMPILED_ARCH_dm820 = "dm7080"

COMPATIBLE_MACHINE = "^(dm820|dm7080)$"

inherit opendreambox-precompiled-binary
