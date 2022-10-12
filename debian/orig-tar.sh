#!/bin/sh -e

TAR=../libxbean-java_$2.orig.tar.xz
DIR=xbean-$2
TAG=xbean-$2

svn export http://svn.apache.org/repos/asf/geronimo/xbean/tags/$TAG $DIR
XZ_OPT=--best tar -c -J -f $TAR $DIR
rm -rf $DIR ../$TAG $3

# move to directory 'tarballs'
if [ -r .svn/deb-layout ]; then
  . .svn/deb-layout
  mv $TAR $origDir
  echo "moved $TAR to $origDir"
fi
