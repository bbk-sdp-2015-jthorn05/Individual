f0 lin 20 6
f1 lin 21 1
f2 lin 22 1
f22 add 15 20 21
here mul 21 21 20
f4 sub 20 20 22
f5 bnz 20 here
f6 out 21
f7 add 1 21 21
f8 out 1
f9 div 1 1 21
f10 out 1
f11 div 2 21 3
f12 div 21 21 1
f13 bnz 21 f12
f14 out 2