#!/usr/bin/perl --

use strict;
use warnings;

use XML::FeedPP;

my $atom_file = "vnctst/public/atom.xml";

my $dst = XML::FeedPP::RSS->new();

$dst->merge($atom_file);
#$dst->normalize();

print $dst->to_string("UTF-8");
