package pokemongame_;

import java.util.Scanner;

public class FightingSystem 
{  
	public void Fight(Pokemon mypok,Pokemon pok)
	{	Bgm fight = new Bgm("src/pokemongame_/bgm/battle.mp3");
		Bgm win = new Bgm("src/pokemongame_/bgm/win.mp3");
		Bgm hit = new Bgm("src/pokemongame_/bgm/hit.mp3");
		fight.play();
		while(true)
	    { View_fight.fightmain(mypok, pok);
		  if(mypok.speed>=pok.speed)
		  {   for(int i=0;i<4;i++)
		  	  {System.out.print(i+1+"."+mypok.skill[i].name_skill+"  ");}
			  int ch= Fuction.getChoice(4);
			  if(!mypok.skill[ch-1].name_skill.equals(""))
			  System.out.println(mypok.name_pok+"税"+mypok.skill[ch-1].name_skill+"因維!!");
			  else {System.out.println("背雁什迭精 紫遂拝呪 蒸柔艦陥.");continue;}
			  if(getGainDamage(pok, getDamage(mypok, mypok.skill[ch-1], mypok.skill[ch-1].pm), mypok.skill[ch-1].pm)>0)
			  {
			  hit.play();
		  	  hit(pok,getGainDamage(pok, getDamage(mypok, mypok.skill[ch-1], mypok.skill[ch-1].pm), mypok.skill[ch-1].pm));
			  System.out.println(pok.name_pok+"戚(亜)"+getGainDamage(pok, getDamage(mypok, mypok.skill[ch-1], mypok.skill[ch-1].pm), mypok.skill[ch-1].pm)+"税 汽耕走研 脊醸陥!!");
			  }
			  else 
			  {hit.play();
			   System.out.println(pok.name_pok+"戚(亜)"+"1税 汽耕走研 脊醸陥!!");
			   hit(pok, 1);												 }
			  View.pause();
			  
			  if(pok.hp<=0) 
			  {
			  fight.close();
			  win.play();
			  System.out.println("穿燈拭辞 渋軒馬写柔艦陥!!!");
			  Fuction.sleep(1000);
			  getExp(mypok,pok);
			  Fuction.sleep(1000);
			  levelup(mypok);
			  Fuction.sleep(1000);
			  evolve(mypok,win);
			  learnSkill(mypok);
			  Fuction.sleep(1000);
			  win.close();
			  break;
			  } 
			  else if(mypok.hp<=0)
			  {fight.close();
			   System.out.println("穿燈拭辞 鳶壕馬写柔艦陥. ばばばばば"); View.view_pokemonCenter2(mypok); break;}
			  
			  int ch2 = 1;
			  if(!pok.skill[ch2-1].name_skill.equals(""))
			  System.out.println(pok.name_pok+"税"+pok.skill[ch2-1].name_skill+"因維!!");
			  if(getGainDamage(mypok, getDamage(pok, pok.skill[ch2-1], pok.skill[ch2-1].pm), pok.skill[ch2-1].pm)>0)
			  {hit.play();
			  hit(mypok,getGainDamage(mypok, getDamage(pok, pok.skill[ch2-1], pok.skill[ch2-1].pm), pok.skill[ch2-1].pm));
			  System.out.println(mypok.name_pok+"戚(亜)"+getGainDamage(mypok, getDamage(pok, pok.skill[ch2-1], pok.skill[ch2-1].pm), pok.skill[ch2-1].pm)+"税 汽耕走研 脊醸陥!!");
			  }
			  else
			  	{ hit.play();
				  System.out.println(mypok.name_pok+"戚(亜)"+"1税 汽耕走研 脊醸陥!!");
			  	 hit(mypok, 1);											}
			  View.pause(); View.pause();
		  }
		  else
		  {
			  int ch2 = 1;
			  if(!pok.skill[ch2-1].name_skill.equals(""))
				  System.out.println(pok.name_pok+"税"+pok.skill[ch2-1].name_skill+"因維!!");
			  if(getGainDamage(mypok, getDamage(pok, pok.skill[ch2-1], pok.skill[ch2-1].pm), pok.skill[ch2-1].pm)>0)
			  {hit.play();
			  hit(mypok,getGainDamage(mypok, getDamage(pok, pok.skill[ch2-1], pok.skill[ch2-1].pm), pok.skill[ch2-1].pm));
			  System.out.println(mypok.name_pok+"戚(亜)"+getGainDamage(mypok, getDamage(pok, pok.skill[ch2-1], pok.skill[ch2-1].pm), pok.skill[ch2-1].pm)+"税 汽耕走研 脊醸陥!!");
			  }
			  else
			  {hit.play();
			  System.out.println(mypok.name_pok+"戚(亜)"+"1税 汽耕走研 脊醸陥!!");
			  hit(mypok, 1);											
			  }
			  for(int i=0;i<4;i++)
		  	  {System.out.print(i+1+"."+mypok.skill[i].name_skill+"  ");}
			  if(pok.hp<=0) 
			  {  
			  fight.close();
			  win.play();
			  System.out.println("穿燈拭辞 渋軒馬写柔艦陥!!!");
			  Fuction.sleep(1000);
			  getExp(mypok,pok);
			  Fuction.sleep(1000);
			  levelup(mypok);
			  Fuction.sleep(1000);
			  evolve(mypok,win);
			  learnSkill(mypok);
			  Fuction.sleep(1000);
			  win.close();
			  break;
			  } 
			  else if(mypok.hp<=0)
			  {fight.close();
			  System.out.println("\n穿燈拭辞 鳶壕馬写柔艦陥. ばばばばば"); View.view_pokemonCenter2(mypok); break;}
			  int ch= Fuction.getChoice(4);
			  if(!mypok.skill[ch-1].name_skill.equals(""))
			  System.out.println(mypok.name_pok+"税"+mypok.skill[ch-1].name_skill+"因維!!");
			  else {System.out.println("背雁什迭精 紫遂拝呪 蒸柔艦陥.");continue;}
			  if(getGainDamage(pok, getDamage(mypok, mypok.skill[ch-1], mypok.skill[ch-1].pm), mypok.skill[ch-1].pm)>0)
			  {
			  hit(pok,getGainDamage(pok, getDamage(mypok, mypok.skill[ch-1], mypok.skill[ch-1].pm), mypok.skill[ch-1].pm));
			  System.out.println(pok.name_pok+"戚(亜)"+getGainDamage(pok, getDamage(mypok, mypok.skill[ch-1], mypok.skill[ch-1].pm), mypok.skill[ch-1].pm)+"税 汽耕走研 脊醸陥!!");
			  }
			  else 
			  {System.out.println(pok.name_pok+"戚(亜)"+"1税 汽耕走研 脊醸陥!!");
			  hit(pok, 1);												 }
			  View.pause();
		  }
		
		
	    }
		pok.hp = pok.hp_max;
	}
	
	public void Fight_challenge(Pokemon mypok,Pokemon pok)
	{	Bgm chal = new Bgm("src/pokemongame_/bgm/challenge.mp3");
		Bgm win = new Bgm("src/pokemongame_/bgm/win.mp3");
		Bgm hit = new Bgm("src/pokemongame_/bgm/hit.mp3");
		chal.play();
		while(true)
		{ View_fight.fightmain(mypok, pok);
		if(mypok.speed>=pok.speed)
		{   for(int i=0;i<4;i++)
		{System.out.print(i+1+"."+mypok.skill[i].name_skill+"  ");}
		int ch= Fuction.getChoice(4);
		if(!mypok.skill[ch-1].name_skill.equals(""))
			System.out.println(mypok.name_pok+"税"+mypok.skill[ch-1].name_skill+"因維!!");
		else {System.out.println("背雁什迭精 紫遂拝呪 蒸柔艦陥.");continue;}
		if(getGainDamage(pok, getDamage(mypok, mypok.skill[ch-1], mypok.skill[ch-1].pm), mypok.skill[ch-1].pm)>0)
		{	hit.play();
			hit(pok,getGainDamage(pok, getDamage(mypok, mypok.skill[ch-1], mypok.skill[ch-1].pm), mypok.skill[ch-1].pm));
			System.out.println(pok.name_pok+"戚(亜)"+getGainDamage(pok, getDamage(mypok, mypok.skill[ch-1], mypok.skill[ch-1].pm), mypok.skill[ch-1].pm)+"税 汽耕走研 脊醸陥!!");
		}
		else 
		{hit.play();
			System.out.println(pok.name_pok+"戚(亜)"+"1税 汽耕走研 脊醸陥!!");
		hit(pok, 1);												 }
		View.pause();
		
		if(pok.hp<=0) 
		{  
		chal.close();
		win.play();
		System.out.println("穿燈拭辞 渋軒馬写柔艦陥!!!");
		Fuction.sleep(1000);
		getExp(mypok,pok);
		Fuction.sleep(1000);
		levelup(mypok);
		Fuction.sleep(1000);
		evolve(mypok,win);
		learnSkill(mypok);
		Fuction.sleep(1000);
		win.close();
		if(View.badge<=View.mytown)
		View.badge++;
		break;
		} 
		else if(mypok.hp<=0)
		{chal.close();System.out.println("穿燈拭辞 鳶壕馬写柔艦陥. ばばばばば"); View.view_pokemonCenter2(mypok); break;}
		
		int ch2 = 1;
		if(!pok.skill[ch2-1].name_skill.equals(""))
			System.out.println(pok.name_pok+"税"+pok.skill[ch2-1].name_skill+"因維!!");
		if(getGainDamage(mypok, getDamage(pok, pok.skill[ch2-1], pok.skill[ch2-1].pm), pok.skill[ch2-1].pm)>0)
		{hit.play();
			hit(mypok,getGainDamage(mypok, getDamage(pok, pok.skill[ch2-1], pok.skill[ch2-1].pm), pok.skill[ch2-1].pm));
			System.out.println(mypok.name_pok+"戚(亜)"+getGainDamage(mypok, getDamage(pok, pok.skill[ch2-1], pok.skill[ch2-1].pm), pok.skill[ch2-1].pm)+"税 汽耕走研 脊醸陥!!");
		}
		else
		{hit.play();
			System.out.println(mypok.name_pok+"戚(亜)"+"1税 汽耕走研 脊醸陥!!");
		hit(mypok, 1);											}
		View.pause(); View.pause();
		}
		else
		{
			int ch2 = 1;
			if(!pok.skill[ch2-1].name_skill.equals(""))
				System.out.println(pok.name_pok+"税"+pok.skill[ch2-1].name_skill+"因維!!");
			if(getGainDamage(mypok, getDamage(pok, pok.skill[ch2-1], pok.skill[ch2-1].pm), pok.skill[ch2-1].pm)>0)
			{	hit.play();
				hit(mypok,getGainDamage(mypok, getDamage(pok, pok.skill[ch2-1], pok.skill[ch2-1].pm), pok.skill[ch2-1].pm));
				System.out.println(mypok.name_pok+"戚(亜)"+getGainDamage(mypok, getDamage(pok, pok.skill[ch2-1], pok.skill[ch2-1].pm), pok.skill[ch2-1].pm)+"税 汽耕走研 脊醸陥!!");
			}
			else
			{	hit.play();
				System.out.println(mypok.name_pok+"戚(亜)"+"1税 汽耕走研 脊醸陥!!");
				hit(mypok, 1);											
			}
			for(int i=0;i<4;i++)
			{System.out.print(i+1+"."+mypok.skill[i].name_skill+"  ");}
			if(pok.hp<=0) 
			{  
			chal.close();
			win.play();
			System.out.println("穿燈拭辞 渋軒馬写柔艦陥!!!");
			Fuction.sleep(1000);
			getExp(mypok,pok);
			Fuction.sleep(1000);
			levelup(mypok);
			Fuction.sleep(1000);
			evolve(mypok,win);
			learnSkill(mypok);
			Fuction.sleep(1000);
			win.close();
			if(View.badge<=View.mytown)
			View.badge++;
			break;
			} 
			else if(mypok.hp<=0)
			{chal.close();System.out.println("\n穿燈拭辞 鳶壕馬写柔艦陥. ばばばばば"); View.view_pokemonCenter2(mypok); break;}
			int ch= Fuction.getChoice(4);
			if(!mypok.skill[ch-1].name_skill.equals(""))
				System.out.println(mypok.name_pok+"税"+mypok.skill[ch-1].name_skill+"因維!!");
			else {System.out.println("背雁什迭精 紫遂拝呪 蒸柔艦陥.");continue;}
			if(getGainDamage(pok, getDamage(mypok, mypok.skill[ch-1], mypok.skill[ch-1].pm), mypok.skill[ch-1].pm)>0)
			{	hit.play();
				hit(pok,getGainDamage(pok, getDamage(mypok, mypok.skill[ch-1], mypok.skill[ch-1].pm), mypok.skill[ch-1].pm));
				System.out.println(pok.name_pok+"戚(亜)"+getGainDamage(pok, getDamage(mypok, mypok.skill[ch-1], mypok.skill[ch-1].pm), mypok.skill[ch-1].pm)+"税 汽耕走研 脊醸陥!!");
			}
			else 
			{hit.play();
				System.out.println(pok.name_pok+"戚(亜)"+"1税 汽耕走研 脊醸陥!!");
			hit(pok, 1);												 }
			View.pause();
		}
		
		
		}
		pok.hp = pok.hp_max;
	}
	
	public int getDamage(Pokemon pok,Skill skill,int skillType)
	{	if(skillType ==1)
		return pok.pap*skill.damage_skill/100;
		return pok.map*skill.damage_skill/100;
	}
	
	public int getGainDamage(Pokemon pok,int damage,int skillType)//閤澗汽耕走
	{   if(skillType ==1)
		return damage-pok.pr/5;
		return damage-pok.mr/5;
	}
	public void hit(Pokemon pok,int damage)
	{		pok.hp -= damage;  	}
	public void levelup(Pokemon pok)
	{	while(true){
		if(pok.exp_has>=pok.exp_max){
		pok.level++;
		System.out.println("傾婚戚"+pok.level+"稽 臣串柔艦陥!");
		pok.exp_has = pok.exp_has-pok.exp_max;
		pok.exp_max += 5;
		pok.hp +=5; 
		pok.hp_max +=5; 
		pok.pap += pok.level*3;
		pok.map += pok.level*3;
		pok.pr += pok.level*3;
		pok.mr += pok.level*3;
		pok.speed += pok.level*3;}
		else break;
	    }
	}
	public void getExp(Pokemon mypok,Pokemon pok)
	{   System.out.println(pok.exp_giving+"税 井蝿帖 塙究!!"); 
		mypok.exp_has += pok.exp_giving;       }
	
	public void evolve(Pokemon mypok,Bgm bgm) 
	{	Bgm evol = new Bgm("src/pokemongame_/bgm/evol.mp3");
		
		String temp = mypok.name_pok;
		if(mypok.level>=25 &&mypok.evol[0]==1) {
			bgm.close();
			evol.play();
			System.out.println("神跡??!? "+mypok.name_pok+"税 雌殿亜?!?!");
			Fuction.sleep(3000);
			System.out.println(".....");
			Fuction.sleep(3000);
			System.out.println(".....");
			Fuction.sleep(3000);
			evol.close();
			bgm.play();
			if(mypok.name_pok.equals("戚雌背松"))
			{
				mypok.name_pok = "戚雌背熱";
				System.out.println(temp+"戚(亜) "+mypok.name_pok+"生稽 遭鉢梅陥!!!");
				mypok.evol[0]=0;
				
			}
			else if(mypok.name_pok.equals("督戚軒"))
			{
				mypok.name_pok = "軒切球";
				System.out.println(temp+"戚(亜) "+mypok.name_pok+"生稽 遭鉢梅陥!!!");
				mypok.evol[0]=0;
			}	
			else if(mypok.name_pok.equals("何採奄"))
			{
				
				mypok.name_pok = "嬢艦採奄";
				System.out.println(temp+"戚(亜) "+mypok.name_pok+"生稽 遭鉢梅陥!!!");
				mypok.evol[0]=0;
			}
		} else if(mypok.level>=50 &&mypok.evol[1]==1) {
			bgm.close();
			evol.play();
			System.out.println("神跡??!? "+mypok.name_pok+"税 雌殿亜?!?!");
			Fuction.sleep(3000);
			System.out.println(".....");
			Fuction.sleep(3000);
			System.out.println(".....");
			Fuction.sleep(3000);
			if(mypok.name_pok.equals("戚雌背熱"))
			{
				mypok.name_pok = "戚雌背寡";
				System.out.println(temp+"戚(亜) "+mypok.name_pok+"生稽 遭鉢梅陥!!!");
				mypok.evol[1]=0;
			}
			else if(mypok.name_pok.equals("軒切球"))
			{
				mypok.name_pok = "軒切功";
				System.out.println(temp+"戚(亜) "+mypok.name_pok+"生稽 遭鉢梅陥!!!");
				mypok.evol[1]=0;
			}	
			else if(mypok.name_pok.equals("嬢艦採奄"))
			{
				mypok.name_pok = "暗栽腎";
				System.out.println(temp+"戚(亜) "+mypok.name_pok+"生稽 遭鉢梅陥!!!");
				mypok.evol[1]=0;
			}
		} else if(mypok.level>=75 &&mypok.evol[2]==1) {
			if(mypok.name_pok.equals("戚雌背寡"))
			{
				mypok.name_pok = "五亜戚雌背寡";
				System.out.println(temp+"戚(亜) "+mypok.name_pok+"生稽 遭鉢梅陥!!!");
				mypok.evol[2]=0;
			}
			else if(mypok.name_pok.equals("軒切功"))
			{
				mypok.name_pok = "五亜軒切功Y";
				System.out.println(temp+"戚(亜) "+mypok.name_pok+"生稽 遭鉢梅陥!!!");
				mypok.evol[2]=0;
			}	
			else if(mypok.name_pok.equals("暗栽腎"))
			{
				mypok.name_pok = "五亜暗栽腎";
				System.out.println(temp+"戚(亜) "+mypok.name_pok+"生稽 遭鉢梅陥!!!");
				mypok.evol[2]=0;
			}
		}
		View.pause();View.pause();
		evol.close();
		
	}
	
	public void learnSkill(Pokemon mypok) {
		if(mypok.level>=10 &&mypok.learnSkill[0]==1) {
			if(mypok.name_pok.equals("戚雌背松")) {
				mypok.skill[1] = Skill_arr.skills[31];
			} else if(mypok.name_pok.equals("督戚軒")) {
				mypok.skill[1] = Skill_arr.skills[4];
			} else if(mypok.name_pok.equals("何採奄")) {
				mypok.skill[1] = Skill_arr.skills[39];
			}
			System.out.println(mypok.name_pok+"戚(亜) 歯稽錘 奄綬");
			System.out.println(mypok.skill[1].name_skill+"聖(研) 壕頗陥!!");	
			mypok.learnSkill[0]=0;
		}else if(mypok.level>=22 &&mypok.learnSkill[1]==1) {
			if(mypok.name_pok.equals("戚雌背松")) {
				mypok.skill[2] = Skill_arr.skills[23];
			} else if(mypok.name_pok.equals("督戚軒")) {
				mypok.skill[2] = Skill_arr.skills[6];
			} else if(mypok.name_pok.equals("何採奄")) {
				mypok.skill[2] = Skill_arr.skills[12];
			}
			System.out.println(mypok.name_pok+"戚(亜) 歯稽錘 奄綬");
			System.out.println(mypok.skill[2].name_skill+"聖(研) 壕頗陥!!");	
			mypok.learnSkill[1]=0;
		}else if(mypok.level>=33 &&mypok.learnSkill[2]==1) {
			if(mypok.name_pok.equals("戚雌背熱")) {
				mypok.skill[3] = Skill_arr.skills[33];
			} else if(mypok.name_pok.equals("軒切球")) {
				mypok.skill[3] = Skill_arr.skills[7];
			} else if(mypok.name_pok.equals("嬢艦採奄")) {
				mypok.skill[3] = Skill_arr.skills[40];
			}
			System.out.println(mypok.name_pok+"戚(亜) 歯稽錘 奄綬");
			System.out.println(mypok.skill[3].name_skill+"聖(研) 壕頗陥!!");	
			mypok.learnSkill[2]=0;
		}else if(mypok.level>=45 &&mypok.learnSkill[3]==1) {
			if(mypok.name_pok.equals("戚雌背熱")) {
				mypok.skill[0] = Skill_arr.skills[34];
			} else if(mypok.name_pok.equals("軒切球")) {
				mypok.skill[0] = Skill_arr.skills[38];
			} else if(mypok.name_pok.equals("嬢艦採奄")) {
				mypok.skill[0] = Skill_arr.skills[41];
			}
			System.out.println(mypok.name_pok+"戚(亜) 歯稽錘 奄綬");
			System.out.print(mypok.skill[0].name_skill+"聖(研) 壕頗陥!!");	
			mypok.learnSkill[3]=0;
		}else if(mypok.level>=56 &&mypok.learnSkill[4]==1) {
			if(mypok.name_pok.equals("戚雌背寡")) {
				mypok.skill[1] = Skill_arr.skills[35];
			} else if(mypok.name_pok.equals("軒切功")) {
				mypok.skill[1] = Skill_arr.skills[22];
			} else if(mypok.name_pok.equals("暗栽腎")) {
				mypok.skill[1] = Skill_arr.skills[19];
			}
			System.out.println(mypok.name_pok+"戚(亜) 歯稽錘 奄綬");
			System.out.println(mypok.skill[1].name_skill+"聖(研) 壕頗陥!!");	
			mypok.learnSkill[4]=0;
		}else if(mypok.level>=68 &&mypok.learnSkill[5]==1) {
			if(mypok.name_pok.equals("戚雌背寡")) {
				mypok.skill[2] = Skill_arr.skills[36];
			} else if(mypok.name_pok.equals("軒切功")) {
				mypok.skill[2] = Skill_arr.skills[38];
			} else if(mypok.name_pok.equals("暗栽腎")) {
				mypok.skill[2] = Skill_arr.skills[26];
			}
			System.out.println(mypok.name_pok+"戚(亜) 歯稽錘 奄綬");
			System.out.println(mypok.skill[2].name_skill+"聖(研) 壕頗陥!!");	
			mypok.learnSkill[5]=0;
		}else if(mypok.level>=81 &&mypok.learnSkill[6]==1) {
			if(mypok.name_pok.equals("五亜戚雌背寡")) {
				mypok.skill[3] = Skill_arr.skills[37];
			} else if(mypok.name_pok.equals("五亜軒切功Y")) {
				mypok.skill[3] = Skill_arr.skills[30];
			} else if(mypok.name_pok.equals("五亜暗栽腎")) {
				mypok.skill[3] = Skill_arr.skills[42];
			}
			System.out.println(mypok.name_pok+"戚(亜) 歯稽錘 奄綬");
			System.out.println(mypok.skill[3].name_skill+"聖(研) 壕頗陥!!");	
			mypok.learnSkill[6]=0;
		}
		
		
		
	}

}