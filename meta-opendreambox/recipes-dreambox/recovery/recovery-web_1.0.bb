SUMMARY = "Provides web pages for the rescue partition"
HOMEPAGE = "http://dreamboxupdate.com/"
LICENSE = "CLOSED"
DEPENDS = "fcgi"
SRCREV = "${@opendreambox_srcrev('5d68fcde19886c1fdf4987ec18ceaa346a40c68a', d)}"
SRCREV_dm7080 = "${@opendreambox_srcrev('d5f26bf9b290632e6ad3e0f6dabcf5ef00afa5e9', d)}"

SRC_URI_append = ";branch=${BRANCH}"

inherit opendreambox-git

do_install() {
    oe_runmake install DESTDIR=${D}
}

PACKAGE_ARCH = "${MACHINE_ARCH}"

RDEPENDS_${PN} = " \
    coreutils-stdbuf \
    haserl \
    lighttpd \
    lighttpd-module-cgi \
    lighttpd-module-fastcgi \
    recovery \
"

BRANCH = "master"
BRANCH_dm7080 = "dm7080"

COMPATIBLE_MACHINE = "^(dm7080)$"
