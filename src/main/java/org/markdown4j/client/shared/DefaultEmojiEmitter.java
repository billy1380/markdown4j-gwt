//
//  DefaultEmojiEmitter.java
//  markdown4j-gwt
//
//  Created by William Shakour (billy1380) on 18 Jul 2017.
//  Copyright © 2017 WillShex Limited. All rights reserved.
//
package org.markdown4j.client.shared;

import com.github.rjeschke.txtmark.Decorator;
import com.github.rjeschke.txtmark.EmojiEmitter;

/**
 * @author William Shakour (billy1380)
 *
 */
public class DefaultEmojiEmitter implements EmojiEmitter {

	private static final String START = "&#x";
	private static final String END = ";";
	private static final String SEPARATOR = END + START;

	/* (non-Javadoc)
	 * 
	 * @see com.github.rjeschke.txtmark.EmojiEmitter#emitEmoji(java.lang.
	 * StringBuilder, java.lang.String,
	 * com.github.rjeschke.txtmark.Decorator) */
	@Override
	public void emitEmoji (StringBuilder out, String name,
			Decorator decorator) {
		out.append(html(name));
	}

	public static String html (String name) {
		String code = code(name), html = "";

		if (code == null) {} else {
			html = START + code.replace("_", SEPARATOR) + END;
		}

		return html;
	}

	public static String code (String name) {
		// smiling face with open mouth and smiling eyes
		if (":u1f604:".equals(name) || ":smile:".equals(name)) return "1f604";
		// smiling face with open mouth
		if (":u1f603:".equals(name) || ":smiley:".equals(name)) return "1f603";
		// grinning face
		if (":u1f600:".equals(name) || ":grinning:".equals(name))
			return "1f600";
		// smiling face with smiling eyes
		if (":u1f60a:".equals(name)) return "1f60a";
		// white smiling face
		if (":u263a:".equals(name) || ":relaxed:".equals(name)) return "263a";
		// winking face
		if (":u1f609:".equals(name) || ":wink:".equals(name)) return "1f609";
		// smiling face with heart-shaped eyes
		if (":u1f60d:".equals(name) || ":heart_eyes:".equals(name))
			return "1f60d";
		// face throwing a kiss
		if (":u1f618:".equals(name) || ":kissing_heart:".equals(name))
			return "1f618";
		// kissing face with closed eyes
		if (":u1f61a:".equals(name) || ":kissing_closed_eyes:".equals(name))
			return "1f61a";
		// kissing face
		if (":u1f617:".equals(name) || ":kissing:".equals(name)) return "1f617";
		// kissing face with smiling eyes
		if (":u1f619:".equals(name) || ":kissing_smiling_eyes:".equals(name))
			return "1f619";
		// face with stuck-out tongue and winking eye
		if (":u1f61c:".equals(name)
				|| ":stuck_out_tongue_winking_eye:".equals(name))
			return "1f61c";
		// face with stuck-out tongue and tightly-closed eyes
		if (":u1f61d:".equals(name)
				|| ":stuck_out_tongue_closed_eyes:".equals(name))
			return "1f61d";
		// face with stuck-out tongue
		if (":u1f61b:".equals(name) || ":stuck_out_tongue:".equals(name))
			return "1f61b";
		// flushed face
		if (":u1f633:".equals(name) || ":flushed:".equals(name)) return "1f633";
		// grinning face with smiling eyes
		if (":u1f601:".equals(name) || ":grin:".equals(name)) return "1f601";
		// pensive face
		if (":u1f614:".equals(name) || ":pensive:".equals(name)) return "1f614";
		// relieved face
		if (":u1f60c:".equals(name) || ":relieved:".equals(name))
			return "1f60c";
		// unamused face
		if (":u1f612:".equals(name) || ":unamused:".equals(name))
			return "1f612";
		// disappointed face
		if (":u1f61e:".equals(name) || ":disappointed:".equals(name))
			return "1f61e";
		// persevering face
		if (":u1f623:".equals(name) || ":persevere:".equals(name))
			return "1f623";
		// crying face
		if (":u1f622:".equals(name) || ":cry:".equals(name)) return "1f622";
		// face with tears of joy
		if (":u1f602:".equals(name) || ":joy:".equals(name)) return "1f602";
		// loudly crying face
		if (":u1f62d:".equals(name) || ":sob:".equals(name)) return "1f62d";
		// sleepy face
		if (":u1f62a:".equals(name) || ":sleepy:".equals(name)) return "1f62a";
		// disappointed but relieved face
		if (":u1f625:".equals(name) || ":disappointed_relieved:".equals(name))
			return "1f625";
		// face with open mouth and cold sweat
		if (":u1f630:".equals(name) || ":cold_sweat:".equals(name))
			return "1f630";
		// smiling face with open mouth and cold sweat
		if (":u1f605:".equals(name) || ":sweat_smile:".equals(name))
			return "1f605";
		// face with cold sweat
		if (":u1f613:".equals(name) || ":sweat:".equals(name)) return "1f613";
		// weary face
		if (":u1f629:".equals(name) || ":weary:".equals(name)) return "1f629";
		// tired face
		if (":u1f62b:".equals(name) || ":tired_face:".equals(name))
			return "1f62b";
		// fearful face
		if (":u1f628:".equals(name) || ":fearful:".equals(name)) return "1f628";
		// face screaming in fear
		if (":u1f631:".equals(name) || ":scream:".equals(name)) return "1f631";
		// angry face
		if (":u1f620:".equals(name) || ":angry:".equals(name)) return "1f620";
		// pouting face
		if (":u1f621:".equals(name) || ":rage:".equals(name)) return "1f621";
		// face with look of triumph
		if (":u1f624:".equals(name) || ":triumph:".equals(name)) return "1f624";
		// confounded face
		if (":u1f616:".equals(name) || ":confounded:".equals(name))
			return "1f616";
		// smiling face with open mouth and tightly-closed eyes
		if (":u1f606:".equals(name) || ":laughing:".equals(name)
				|| ":satisfied:".equals(name))
			return "1f606";
		// face savouring delicious food
		if (":u1f60b:".equals(name) || ":yum:".equals(name)) return "1f60b";
		// face with medical mask
		if (":u1f637:".equals(name) || ":mask:".equals(name)) return "1f637";
		// smiling face with sunglasses
		if (":u1f60e:".equals(name) || ":sunglasses:".equals(name))
			return "1f60e";
		// sleeping face
		if (":u1f634:".equals(name) || ":sleeping:".equals(name))
			return "1f634";
		// dizzy face
		if (":u1f635:".equals(name) || ":dizzy_face:".equals(name))
			return "1f635";
		// astonished face
		if (":u1f632:".equals(name) || ":astonished:".equals(name))
			return "1f632";
		// worried face
		if (":u1f61f:".equals(name) || ":worried:".equals(name)) return "1f61f";
		// frowning face with open mouth
		if (":u1f626:".equals(name) || ":frowning:".equals(name))
			return "1f626";
		// anguished face
		if (":u1f627:".equals(name) || ":anguished:".equals(name))
			return "1f627";
		// smiling face with horns
		if (":u1f608:".equals(name) || ":smiling_imp:".equals(name))
			return "1f608";
		// imp
		if (":u1f47f:".equals(name) || ":imp:".equals(name)) return "1f47f";
		// face with open mouth
		if (":u1f62e:".equals(name) || ":open_mouth:".equals(name))
			return "1f62e";
		// grimacing face
		if (":u1f62c:".equals(name) || ":grimacing:".equals(name))
			return "1f62c";
		// neutral face
		if (":u1f610:".equals(name) || ":neutral_face:".equals(name))
			return "1f610";
		// confused face
		if (":u1f615:".equals(name) || ":confused:".equals(name))
			return "1f615";
		// hushed face
		if (":u1f62f:".equals(name) || ":hushed:".equals(name)) return "1f62f";
		// face without mouth
		if (":u1f636:".equals(name) || ":no_mouth:".equals(name))
			return "1f636";
		// smiling face with halo
		if (":u1f607:".equals(name) || ":innocent:".equals(name))
			return "1f607";
		// smirking face
		if (":u1f60f:".equals(name) || ":smirk:".equals(name)) return "1f60f";
		// expressionless face
		if (":u1f611:".equals(name) || ":expressionless:".equals(name))
			return "1f611";
		// man with gua pi mao
		if (":u1f472:".equals(name) || ":man_with_gua_pi_mao:".equals(name))
			return "1f472";
		// man with turban
		if (":u1f473:".equals(name) || ":man_with_turban:".equals(name))
			return "1f473";
		// police officer
		if (":u1f46e:".equals(name) || ":cop:".equals(name)) return "1f46e";
		// construction worker
		if (":u1f477:".equals(name) || ":construction_worker:".equals(name))
			return "1f477";
		// guardsman
		if (":u1f482:".equals(name) || ":guardsman:".equals(name))
			return "1f482";
		// baby
		if (":u1f476:".equals(name) || ":baby:".equals(name)) return "1f476";
		// boy
		if (":u1f466:".equals(name) || ":boy:".equals(name)) return "1f466";
		// girl
		if (":u1f467:".equals(name) || ":girl:".equals(name)) return "1f467";
		// man
		if (":u1f468:".equals(name) || ":man:".equals(name)) return "1f468";
		// woman
		if (":u1f469:".equals(name) || ":woman:".equals(name)) return "1f469";
		// older man
		if (":u1f474:".equals(name) || ":older_man:".equals(name))
			return "1f474";
		// older woman
		if (":u1f475:".equals(name) || ":older_woman:".equals(name))
			return "1f475";
		// person with blond hair
		if (":u1f471:".equals(name) || ":person_with_blond_hair:".equals(name))
			return "1f471";
		// baby angel
		if (":u1f47c:".equals(name) || ":angel:".equals(name)) return "1f47c";
		// princess
		if (":u1f478:".equals(name) || ":princess:".equals(name))
			return "1f478";
		// smiling cat face with open mouth
		if (":u1f63a:".equals(name) || ":smiley_cat:".equals(name))
			return "1f63a";
		// grinning cat face with smiling eyes
		if (":u1f638:".equals(name) || ":smile_cat:".equals(name))
			return "1f638";
		// smiling cat face with heart-shaped eyes
		if (":u1f63b:".equals(name) || ":heart_eyes_cat:".equals(name))
			return "1f63b";
		// kissing cat face with closed eyes
		if (":u1f63d:".equals(name) || ":kissing_cat:".equals(name))
			return "1f63d";
		// cat face with wry smile
		if (":u1f63c:".equals(name) || ":smirk_cat:".equals(name))
			return "1f63c";
		// weary cat face
		if (":u1f640:".equals(name) || ":scream_cat:".equals(name))
			return "1f640";
		// crying cat face
		if (":u1f63f:".equals(name) || ":crying_cat_face:".equals(name))
			return "1f63f";
		// cat face with tears of joy
		if (":u1f639:".equals(name) || ":joy_cat:".equals(name)) return "1f639";
		// pouting cat face
		if (":u1f63e:".equals(name) || ":pouting_cat:".equals(name))
			return "1f63e";
		// japanese ogre
		if (":u1f479:".equals(name) || ":japanese_ogre:".equals(name))
			return "1f479";
		// japanese goblin
		if (":u1f47a:".equals(name) || ":japanese_goblin:".equals(name))
			return "1f47a";
		// see-no-evil monkey
		if (":u1f648:".equals(name) || ":see_no_evil:".equals(name))
			return "1f648";
		// hear-no-evil monkey
		if (":u1f649:".equals(name) || ":hear_no_evil:".equals(name))
			return "1f649";
		// speak-no-evil monkey
		if (":u1f64a:".equals(name) || ":speak_no_evil:".equals(name))
			return "1f64a";
		// skull
		if (":u1f480:".equals(name) || ":skull:".equals(name)) return "1f480";
		// extraterrestrial alien
		if (":u1f47d:".equals(name) || ":alien:".equals(name)) return "1f47d";
		// pile of poo
		if (":u1f4a9:".equals(name) || ":hankey:".equals(name)
				|| ":poop:".equals(name) || ":shit:".equals(name))
			return "1f4a9";
		// fire
		if (":u1f525:".equals(name) || ":fire:".equals(name)) return "1f525";
		// sparkles
		if (":u2728:".equals(name) || ":sparkles:".equals(name)) return "2728";
		// glowing star
		if (":u1f31f:".equals(name) || ":star2:".equals(name)) return "1f31f";
		// dizzy symbol
		if (":u1f4ab:".equals(name) || ":dizzy:".equals(name)) return "1f4ab";
		// collision symbol
		if (":u1f4a5:".equals(name) || ":boom:".equals(name)
				|| ":collision:".equals(name))
			return "1f4a5";
		// anger symbol
		if (":u1f4a2:".equals(name) || ":anger:".equals(name)) return "1f4a2";
		// splashing sweat symbol
		if (":u1f4a6:".equals(name) || ":sweat_drops:".equals(name))
			return "1f4a6";
		// droplet
		if (":u1f4a7:".equals(name) || ":droplet:".equals(name)) return "1f4a7";
		// sleeping symbol
		if (":u1f4a4:".equals(name) || ":zzz:".equals(name)) return "1f4a4";
		// dash symbol
		if (":u1f4a8:".equals(name) || ":dash:".equals(name)) return "1f4a8";
		// ear
		if (":u1f442:".equals(name) || ":ear:".equals(name)) return "1f442";
		// eyes
		if (":u1f440:".equals(name) || ":eyes:".equals(name)) return "1f440";
		// nose
		if (":u1f443:".equals(name) || ":nose:".equals(name)) return "1f443";
		// tongue
		if (":u1f445:".equals(name) || ":tongue:".equals(name)) return "1f445";
		// mouth
		if (":u1f444:".equals(name) || ":lips:".equals(name)) return "1f444";
		// thumbs up sign
		if (":u1f44d:".equals(name) || ":+1:".equals(name)
				|| ":thumbsup:".equals(name))
			return "1f44d";
		// thumbs down sign
		if (":u1f44e:".equals(name) || ":-1:".equals(name)
				|| ":thumbsdown:".equals(name))
			return "1f44e";
		// ok hand sign
		if (":u1f44c:".equals(name) || ":ok_hand:".equals(name)) return "1f44c";
		// fisted hand sign
		if (":u1f44a:".equals(name) || ":facepunch:".equals(name)
				|| ":punch:".equals(name))
			return "1f44a";
		// raised fist
		if (":u270a:".equals(name) || ":fist:".equals(name)) return "270a";
		// victory hand
		if (":u270c:".equals(name) || ":v:".equals(name)) return "270c";
		// waving hand sign
		if (":u1f44b:".equals(name) || ":wave:".equals(name)) return "1f44b";
		// raised hand
		if (":u270b:".equals(name) || ":hand:".equals(name)
				|| ":raised_hand:".equals(name))
			return "270b";
		// open hands sign
		if (":u1f450:".equals(name) || ":open_hands:".equals(name))
			return "1f450";
		// white up pointing backhand index
		if (":u1f446:".equals(name) || ":point_up_2:".equals(name))
			return "1f446";
		// white down pointing backhand index
		if (":u1f447:".equals(name) || ":point_down:".equals(name))
			return "1f447";
		// white right pointing backhand index
		if (":u1f449:".equals(name) || ":point_right:".equals(name))
			return "1f449";
		// white left pointing backhand index
		if (":u1f448:".equals(name) || ":point_left:".equals(name))
			return "1f448";
		// person raising both hands in celebration
		if (":u1f64c:".equals(name) || ":raised_hands:".equals(name))
			return "1f64c";
		// person with folded hands
		if (":u1f64f:".equals(name) || ":pray:".equals(name)) return "1f64f";
		// white up pointing index
		if (":u261d:".equals(name) || ":point_up:".equals(name)) return "261d";
		// clapping hands sign
		if (":u1f44f:".equals(name) || ":clap:".equals(name)) return "1f44f";
		// flexed biceps
		if (":u1f4aa:".equals(name) || ":muscle:".equals(name)) return "1f4aa";
		// pedestrian
		if (":u1f6b6:".equals(name) || ":walking:".equals(name)) return "1f6b6";
		// runner
		if (":u1f3c3:".equals(name) || ":runner:".equals(name)
				|| ":running:".equals(name))
			return "1f3c3";
		// dancer
		if (":u1f483:".equals(name) || ":dancer:".equals(name)) return "1f483";
		// man and woman holding hands
		if (":u1f46b:".equals(name) || ":couple:".equals(name)) return "1f46b";
		// family
		if (":u1f46a:".equals(name) || ":family:".equals(name)) return "1f46a";
		// two men holding hands
		if (":u1f46c:".equals(name) || ":two_men_holding_hands:".equals(name))
			return "1f46c";
		// two women holding hands
		if (":u1f46d:".equals(name) || ":two_women_holding_hands:".equals(name))
			return "1f46d";
		// kiss
		if (":u1f48f:".equals(name) || ":couplekiss:".equals(name))
			return "1f48f";
		// couple with heart
		if (":u1f491:".equals(name) || ":couple_with_heart:".equals(name))
			return "1f491";
		// woman with bunny ears
		if (":u1f46f:".equals(name) || ":dancers:".equals(name)) return "1f46f";
		// face with ok gesture
		if (":u1f646:".equals(name) || ":ok_woman:".equals(name))
			return "1f646";
		// face with no good gesture
		if (":u1f645:".equals(name) || ":no_good:".equals(name)) return "1f645";
		// information desk person
		if (":u1f481:".equals(name) || ":information_desk_person:".equals(name))
			return "1f481";
		// happy person raising one hand
		if (":u1f64b:".equals(name) || ":raising_hand:".equals(name))
			return "1f64b";
		// face massage
		if (":u1f486:".equals(name) || ":massage:".equals(name)) return "1f486";
		// haircut
		if (":u1f487:".equals(name) || ":haircut:".equals(name)) return "1f487";
		// nail polish
		if (":u1f485:".equals(name) || ":nail_care:".equals(name))
			return "1f485";
		// bride with veil
		if (":u1f470:".equals(name) || ":bride_with_veil:".equals(name))
			return "1f470";
		// person with pouting face
		if (":u1f64e:".equals(name)
				|| ":person_with_pouting_face:".equals(name))
			return "1f64e";
		// person frowning
		if (":u1f64d:".equals(name) || ":person_frowning:".equals(name))
			return "1f64d";
		// person bowing deeply
		if (":u1f647:".equals(name) || ":bow:".equals(name)) return "1f647";
		// top hat
		if (":u1f3a9:".equals(name) || ":tophat:".equals(name)) return "1f3a9";
		// crown
		if (":u1f451:".equals(name) || ":crown:".equals(name)) return "1f451";
		// womans hat
		if (":u1f452:".equals(name) || ":womans_hat:".equals(name))
			return "1f452";
		// athletic shoe
		if (":u1f45f:".equals(name) || ":athletic_shoe:".equals(name))
			return "1f45f";
		// mans shoe
		if (":u1f45e:".equals(name) || ":mans_shoe:".equals(name)
				|| ":shoe:".equals(name))
			return "1f45e";
		// womans sandal
		if (":u1f461:".equals(name) || ":sandal:".equals(name)) return "1f461";
		// high-heeled shoe
		if (":u1f460:".equals(name) || ":high_heel:".equals(name))
			return "1f460";
		// womans boots
		if (":u1f462:".equals(name) || ":boot:".equals(name)) return "1f462";
		// t-shirt
		if (":u1f455:".equals(name) || ":shirt:".equals(name)
				|| ":tshirt:".equals(name))
			return "1f455";
		// necktie
		if (":u1f454:".equals(name) || ":necktie:".equals(name)) return "1f454";
		// womans clothes
		if (":u1f45a:".equals(name) || ":womans_clothes:".equals(name))
			return "1f45a";
		// dress
		if (":u1f457:".equals(name) || ":dress:".equals(name)) return "1f457";
		// running shirt with sash
		if (":u1f3bd:".equals(name) || ":running_shirt_with_sash:".equals(name))
			return "1f3bd";
		// jeans
		if (":u1f456:".equals(name) || ":jeans:".equals(name)) return "1f456";
		// kimono
		if (":u1f458:".equals(name) || ":kimono:".equals(name)) return "1f458";
		// bikini
		if (":u1f459:".equals(name) || ":bikini:".equals(name)) return "1f459";
		// briefcase
		if (":u1f4bc:".equals(name) || ":briefcase:".equals(name))
			return "1f4bc";
		// handbag
		if (":u1f45c:".equals(name) || ":handbag:".equals(name)) return "1f45c";
		// pouch
		if (":u1f45d:".equals(name) || ":pouch:".equals(name)) return "1f45d";
		// purse
		if (":u1f45b:".equals(name) || ":purse:".equals(name)) return "1f45b";
		// eyeglasses
		if (":u1f453:".equals(name) || ":eyeglasses:".equals(name))
			return "1f453";
		// ribbon
		if (":u1f380:".equals(name) || ":ribbon:".equals(name)) return "1f380";
		// closed umbrella
		if (":u1f302:".equals(name) || ":closed_umbrella:".equals(name))
			return "1f302";
		// lipstick
		if (":u1f484:".equals(name) || ":lipstick:".equals(name))
			return "1f484";
		// yellow heart
		if (":u1f49b:".equals(name) || ":yellow_heart:".equals(name))
			return "1f49b";
		// blue heart
		if (":u1f499:".equals(name) || ":blue_heart:".equals(name))
			return "1f499";
		// purple heart
		if (":u1f49c:".equals(name) || ":purple_heart:".equals(name))
			return "1f49c";
		// green heart
		if (":u1f49a:".equals(name) || ":green_heart:".equals(name))
			return "1f49a";
		// heavy black heart
		if (":u2764:".equals(name) || ":heart:".equals(name)) return "2764";
		// broken heart
		if (":u1f494:".equals(name) || ":broken_heart:".equals(name))
			return "1f494";
		// growing heart
		if (":u1f497:".equals(name) || ":heartpulse:".equals(name))
			return "1f497";
		// beating heart
		if (":u1f493:".equals(name) || ":heartbeat:".equals(name))
			return "1f493";
		// two hearts
		if (":u1f495:".equals(name) || ":two_hearts:".equals(name))
			return "1f495";
		// sparkling heart
		if (":u1f496:".equals(name) || ":sparkling_heart:".equals(name))
			return "1f496";
		// revolving hearts
		if (":u1f49e:".equals(name) || ":revolving_hearts:".equals(name))
			return "1f49e";
		// heart with arrow
		if (":u1f498:".equals(name) || ":cupid:".equals(name)) return "1f498";
		// love letter
		if (":u1f48c:".equals(name) || ":love_letter:".equals(name))
			return "1f48c";
		// kiss mark
		if (":u1f48b:".equals(name) || ":kiss:".equals(name)) return "1f48b";
		// ring
		if (":u1f48d:".equals(name) || ":ring:".equals(name)) return "1f48d";
		// gem stone
		if (":u1f48e:".equals(name) || ":gem:".equals(name)) return "1f48e";
		// bust in silhouette
		if (":u1f464:".equals(name) || ":bust_in_silhouette:".equals(name))
			return "1f464";
		// busts in silhouette
		if (":u1f465:".equals(name) || ":busts_in_silhouette:".equals(name))
			return "1f465";
		// speech balloon
		if (":u1f4ac:".equals(name) || ":speech_balloon:".equals(name))
			return "1f4ac";
		// footprints
		if (":u1f463:".equals(name) || ":footprints:".equals(name))
			return "1f463";
		// thought balloon
		if (":u1f4ad:".equals(name) || ":thought_balloon:".equals(name))
			return "1f4ad";
		// dog face
		if (":u1f436:".equals(name) || ":dog:".equals(name)) return "1f436";
		// wolf face
		if (":u1f43a:".equals(name) || ":wolf:".equals(name)) return "1f43a";
		// cat face
		if (":u1f431:".equals(name) || ":cat:".equals(name)) return "1f431";
		// mouse face
		if (":u1f42d:".equals(name) || ":mouse:".equals(name)) return "1f42d";
		// hamster face
		if (":u1f439:".equals(name) || ":hamster:".equals(name)) return "1f439";
		// rabbit face
		if (":u1f430:".equals(name) || ":rabbit:".equals(name)) return "1f430";
		// frog face
		if (":u1f438:".equals(name) || ":frog:".equals(name)) return "1f438";
		// tiger face
		if (":u1f42f:".equals(name) || ":tiger:".equals(name)) return "1f42f";
		// koala
		if (":u1f428:".equals(name) || ":koala:".equals(name)) return "1f428";
		// bear face
		if (":u1f43b:".equals(name) || ":bear:".equals(name)) return "1f43b";
		// pig face
		if (":u1f437:".equals(name) || ":pig:".equals(name)) return "1f437";
		// pig nose
		if (":u1f43d:".equals(name) || ":pig_nose:".equals(name))
			return "1f43d";
		// cow face
		if (":u1f42e:".equals(name) || ":cow:".equals(name)) return "1f42e";
		// boar
		if (":u1f417:".equals(name) || ":boar:".equals(name)) return "1f417";
		// monkey face
		if (":u1f435:".equals(name) || ":monkey_face:".equals(name))
			return "1f435";
		// monkey
		if (":u1f412:".equals(name) || ":monkey:".equals(name)) return "1f412";
		// horse face
		if (":u1f434:".equals(name) || ":horse:".equals(name)) return "1f434";
		// sheep
		if (":u1f411:".equals(name) || ":sheep:".equals(name)) return "1f411";
		// elephant
		if (":u1f418:".equals(name) || ":elephant:".equals(name))
			return "1f418";
		// panda face
		if (":u1f43c:".equals(name) || ":panda_face:".equals(name))
			return "1f43c";
		// penguin
		if (":u1f427:".equals(name) || ":penguin:".equals(name)) return "1f427";
		// bird
		if (":u1f426:".equals(name) || ":bird:".equals(name)) return "1f426";
		// baby chick
		if (":u1f424:".equals(name) || ":baby_chick:".equals(name))
			return "1f424";
		// front-facing baby chick
		if (":u1f425:".equals(name) || ":hatched_chick:".equals(name))
			return "1f425";
		// hatching chick
		if (":u1f423:".equals(name) || ":hatching_chick:".equals(name))
			return "1f423";
		// chicken
		if (":u1f414:".equals(name) || ":chicken:".equals(name)) return "1f414";
		// snake
		if (":u1f40d:".equals(name) || ":snake:".equals(name)) return "1f40d";
		// turtle
		if (":u1f422:".equals(name) || ":turtle:".equals(name)) return "1f422";
		// bug
		if (":u1f41b:".equals(name) || ":bug:".equals(name)) return "1f41b";
		// honeybee
		if (":u1f41d:".equals(name) || ":bee:".equals(name)
				|| ":honeybee:".equals(name))
			return "1f41d";
		// ant
		if (":u1f41c:".equals(name) || ":ant:".equals(name)) return "1f41c";
		// lady beetle
		if (":u1f41e:".equals(name) || ":beetle:".equals(name)) return "1f41e";
		// snail
		if (":u1f40c:".equals(name) || ":snail:".equals(name)) return "1f40c";
		// octopus
		if (":u1f419:".equals(name) || ":octopus:".equals(name)) return "1f419";
		// spiral shell
		if (":u1f41a:".equals(name) || ":shell:".equals(name)) return "1f41a";
		// tropical fish
		if (":u1f420:".equals(name) || ":tropical_fish:".equals(name))
			return "1f420";
		// fish
		if (":u1f41f:".equals(name) || ":fish:".equals(name)) return "1f41f";
		// dolphin
		if (":u1f42c:".equals(name) || ":dolphin:".equals(name)
				|| ":flipper:".equals(name))
			return "1f42c";
		// spouting whale
		if (":u1f433:".equals(name) || ":whale:".equals(name)) return "1f433";
		// whale
		if (":u1f40b:".equals(name) || ":whale2:".equals(name)) return "1f40b";
		// cow
		if (":u1f404:".equals(name) || ":cow2:".equals(name)) return "1f404";
		// ram
		if (":u1f40f:".equals(name) || ":ram:".equals(name)) return "1f40f";
		// rat
		if (":u1f400:".equals(name) || ":rat:".equals(name)) return "1f400";
		// water buffalo
		if (":u1f403:".equals(name) || ":water_buffalo:".equals(name))
			return "1f403";
		// tiger
		if (":u1f405:".equals(name) || ":tiger2:".equals(name)) return "1f405";
		// rabbit
		if (":u1f407:".equals(name) || ":rabbit2:".equals(name)) return "1f407";
		// dragon
		if (":u1f409:".equals(name) || ":dragon:".equals(name)) return "1f409";
		// horse
		if (":u1f40e:".equals(name) || ":racehorse:".equals(name))
			return "1f40e";
		// goat
		if (":u1f410:".equals(name) || ":goat:".equals(name)) return "1f410";
		// rooster
		if (":u1f413:".equals(name) || ":rooster:".equals(name)) return "1f413";
		// dog
		if (":u1f415:".equals(name) || ":dog2:".equals(name)) return "1f415";
		// pig
		if (":u1f416:".equals(name) || ":pig2:".equals(name)) return "1f416";
		// mouse
		if (":u1f401:".equals(name) || ":mouse2:".equals(name)) return "1f401";
		// ox
		if (":u1f402:".equals(name) || ":ox:".equals(name)) return "1f402";
		// dragon face
		if (":u1f432:".equals(name) || ":dragon_face:".equals(name))
			return "1f432";
		// blowfish
		if (":u1f421:".equals(name) || ":blowfish:".equals(name))
			return "1f421";
		// crocodile
		if (":u1f40a:".equals(name) || ":crocodile:".equals(name))
			return "1f40a";
		// bactrian camel
		if (":u1f42b:".equals(name) || ":camel:".equals(name)) return "1f42b";
		// dromedary camel
		if (":u1f42a:".equals(name) || ":dromedary_camel:".equals(name))
			return "1f42a";
		// leopard
		if (":u1f406:".equals(name) || ":leopard:".equals(name)) return "1f406";
		// cat
		if (":u1f408:".equals(name) || ":cat2:".equals(name)) return "1f408";
		// poodle
		if (":u1f429:".equals(name) || ":poodle:".equals(name)) return "1f429";
		// paw prints
		if (":u1f43e:".equals(name) || ":feet:".equals(name)
				|| ":paw_prints:".equals(name))
			return "1f43e";
		// bouquet
		if (":u1f490:".equals(name) || ":bouquet:".equals(name)) return "1f490";
		// cherry blossom
		if (":u1f338:".equals(name) || ":cherry_blossom:".equals(name))
			return "1f338";
		// tulip
		if (":u1f337:".equals(name) || ":tulip:".equals(name)) return "1f337";
		// four leaf clover
		if (":u1f340:".equals(name) || ":four_leaf_clover:".equals(name))
			return "1f340";
		// rose
		if (":u1f339:".equals(name) || ":rose:".equals(name)) return "1f339";
		// sunflower
		if (":u1f33b:".equals(name) || ":sunflower:".equals(name))
			return "1f33b";
		// hibiscus
		if (":u1f33a:".equals(name) || ":hibiscus:".equals(name))
			return "1f33a";
		// maple leaf
		if (":u1f341:".equals(name) || ":maple_leaf:".equals(name))
			return "1f341";
		// leaf fluttering in wind
		if (":u1f343:".equals(name) || ":leaves:".equals(name)) return "1f343";
		// fallen leaf
		if (":u1f342:".equals(name) || ":fallen_leaf:".equals(name))
			return "1f342";
		// herb
		if (":u1f33f:".equals(name) || ":herb:".equals(name)) return "1f33f";
		// ear of rice
		if (":u1f33e:".equals(name) || ":ear_of_rice:".equals(name))
			return "1f33e";
		// mushroom
		if (":u1f344:".equals(name) || ":mushroom:".equals(name))
			return "1f344";
		// cactus
		if (":u1f335:".equals(name) || ":cactus:".equals(name)) return "1f335";
		// palm tree
		if (":u1f334:".equals(name) || ":palm_tree:".equals(name))
			return "1f334";
		// evergreen tree
		if (":u1f332:".equals(name) || ":evergreen_tree:".equals(name))
			return "1f332";
		// deciduous tree
		if (":u1f333:".equals(name) || ":deciduous_tree:".equals(name))
			return "1f333";
		// chestnut
		if (":u1f330:".equals(name) || ":chestnut:".equals(name))
			return "1f330";
		// seedling
		if (":u1f331:".equals(name) || ":seedling:".equals(name))
			return "1f331";
		// blossom
		if (":u1f33c:".equals(name) || ":blossom:".equals(name)) return "1f33c";
		// globe with meridians
		if (":u1f310:".equals(name) || ":globe_with_meridians:".equals(name))
			return "1f310";
		// sun with face
		if (":u1f31e:".equals(name) || ":sun_with_face:".equals(name))
			return "1f31e";
		// full moon with face
		if (":u1f31d:".equals(name) || ":full_moon_with_face:".equals(name))
			return "1f31d";
		// new moon with face
		if (":u1f31a:".equals(name) || ":new_moon_with_face:".equals(name))
			return "1f31a";
		// new moon symbol
		if (":u1f311:".equals(name) || ":new_moon:".equals(name))
			return "1f311";
		// waxing crescent moon symbol
		if (":u1f312:".equals(name) || ":waxing_crescent_moon:".equals(name))
			return "1f312";
		// first quarter moon symbol
		if (":u1f313:".equals(name) || ":first_quarter_moon:".equals(name))
			return "1f313";
		// waxing gibbous moon symbol
		if (":u1f314:".equals(name) || ":moon:".equals(name)
				|| ":waxing_gibbous_moon:".equals(name))
			return "1f314";
		// full moon symbol
		if (":u1f315:".equals(name) || ":full_moon:".equals(name))
			return "1f315";
		// waning gibbous moon symbol
		if (":u1f316:".equals(name) || ":waning_gibbous_moon:".equals(name))
			return "1f316";
		// last quarter moon symbol
		if (":u1f317:".equals(name) || ":last_quarter_moon:".equals(name))
			return "1f317";
		// waning crescent moon symbol
		if (":u1f318:".equals(name) || ":waning_crescent_moon:".equals(name))
			return "1f318";
		// last quarter moon with face
		if (":u1f31c:".equals(name)
				|| ":last_quarter_moon_with_face:".equals(name))
			return "1f31c";
		// first quarter moon with face
		if (":u1f31b:".equals(name)
				|| ":first_quarter_moon_with_face:".equals(name))
			return "1f31b";
		// crescent moon
		if (":u1f319:".equals(name) || ":crescent_moon:".equals(name))
			return "1f319";
		// earth globe europe-africa
		if (":u1f30d:".equals(name) || ":earth_africa:".equals(name))
			return "1f30d";
		// earth globe americas
		if (":u1f30e:".equals(name) || ":earth_americas:".equals(name))
			return "1f30e";
		// earth globe asia-australia
		if (":u1f30f:".equals(name) || ":earth_asia:".equals(name))
			return "1f30f";
		// volcano
		if (":u1f30b:".equals(name) || ":volcano:".equals(name)) return "1f30b";
		// milky way
		if (":u1f30c:".equals(name) || ":milky_way:".equals(name))
			return "1f30c";
		// shooting star
		if (":u1f320:".equals(name) || ":stars:".equals(name)) return "1f320";
		// white medium star
		if (":u2b50:".equals(name) || ":star:".equals(name)) return "2b50";
		// black sun with rays
		if (":u2600:".equals(name) || ":sunny:".equals(name)) return "2600";
		// sun behind cloud
		if (":u26c5:".equals(name) || ":partly_sunny:".equals(name))
			return "26c5";
		// cloud
		if (":u2601:".equals(name) || ":cloud:".equals(name)) return "2601";
		// high voltage sign
		if (":u26a1:".equals(name) || ":zap:".equals(name)) return "26a1";
		// umbrella with rain drops
		if (":u2614:".equals(name) || ":umbrella:".equals(name)) return "2614";
		// snowflake
		if (":u2744:".equals(name) || ":snowflake:".equals(name)) return "2744";
		// snowman without snow
		if (":u26c4:".equals(name) || ":snowman:".equals(name)) return "26c4";
		// cyclone
		if (":u1f300:".equals(name) || ":cyclone:".equals(name)) return "1f300";
		// foggy
		if (":u1f301:".equals(name) || ":foggy:".equals(name)) return "1f301";
		// rainbow
		if (":u1f308:".equals(name) || ":rainbow:".equals(name)) return "1f308";
		// water wave
		if (":u1f30a:".equals(name) || ":ocean:".equals(name)) return "1f30a";
		// pine decoration
		if (":u1f38d:".equals(name) || ":bamboo:".equals(name)) return "1f38d";
		// heart with ribbon
		if (":u1f49d:".equals(name) || ":gift_heart:".equals(name))
			return "1f49d";
		// japanese dolls
		if (":u1f38e:".equals(name) || ":dolls:".equals(name)) return "1f38e";
		// school satchel
		if (":u1f392:".equals(name) || ":school_satchel:".equals(name))
			return "1f392";
		// graduation cap
		if (":u1f393:".equals(name) || ":mortar_board:".equals(name))
			return "1f393";
		// carp streamer
		if (":u1f38f:".equals(name) || ":flags:".equals(name)) return "1f38f";
		// fireworks
		if (":u1f386:".equals(name) || ":fireworks:".equals(name))
			return "1f386";
		// firework sparkler
		if (":u1f387:".equals(name) || ":sparkler:".equals(name))
			return "1f387";
		// wind chime
		if (":u1f390:".equals(name) || ":wind_chime:".equals(name))
			return "1f390";
		// moon viewing ceremony
		if (":u1f391:".equals(name) || ":rice_scene:".equals(name))
			return "1f391";
		// jack-o-lantern
		if (":u1f383:".equals(name) || ":jack_o_lantern:".equals(name))
			return "1f383";
		// ghost
		if (":u1f47b:".equals(name) || ":ghost:".equals(name)) return "1f47b";
		// father christmas
		if (":u1f385:".equals(name) || ":santa:".equals(name)) return "1f385";
		// christmas tree
		if (":u1f384:".equals(name) || ":christmas_tree:".equals(name))
			return "1f384";
		// wrapped present
		if (":u1f381:".equals(name) || ":gift:".equals(name)) return "1f381";
		// tanabata tree
		if (":u1f38b:".equals(name) || ":tanabata_tree:".equals(name))
			return "1f38b";
		// party popper
		if (":u1f389:".equals(name) || ":tada:".equals(name)) return "1f389";
		// confetti ball
		if (":u1f38a:".equals(name) || ":confetti_ball:".equals(name))
			return "1f38a";
		// balloon
		if (":u1f388:".equals(name) || ":balloon:".equals(name)) return "1f388";
		// crossed flags
		if (":u1f38c:".equals(name) || ":crossed_flags:".equals(name))
			return "1f38c";
		// crystal ball
		if (":u1f52e:".equals(name) || ":crystal_ball:".equals(name))
			return "1f52e";
		// movie camera
		if (":u1f3a5:".equals(name) || ":movie_camera:".equals(name))
			return "1f3a5";
		// camera
		if (":u1f4f7:".equals(name) || ":camera:".equals(name)) return "1f4f7";
		// video camera
		if (":u1f4f9:".equals(name) || ":video_camera:".equals(name))
			return "1f4f9";
		// videocassette
		if (":u1f4fc:".equals(name) || ":vhs:".equals(name)) return "1f4fc";
		// optical disc
		if (":u1f4bf:".equals(name) || ":cd:".equals(name)) return "1f4bf";
		// dvd
		if (":u1f4c0:".equals(name) || ":dvd:".equals(name)) return "1f4c0";
		// minidisc
		if (":u1f4bd:".equals(name) || ":minidisc:".equals(name))
			return "1f4bd";
		// floppy disk
		if (":u1f4be:".equals(name) || ":floppy_disk:".equals(name))
			return "1f4be";
		// personal computer
		if (":u1f4bb:".equals(name) || ":computer:".equals(name))
			return "1f4bb";
		// mobile phone
		if (":u1f4f1:".equals(name) || ":iphone:".equals(name)) return "1f4f1";
		// black telephone
		if (":u260e:".equals(name) || ":phone:".equals(name)
				|| ":telephone:".equals(name))
			return "260e";
		// telephone receiver
		if (":u1f4de:".equals(name) || ":telephone_receiver:".equals(name))
			return "1f4de";
		// pager
		if (":u1f4df:".equals(name) || ":pager:".equals(name)) return "1f4df";
		// fax machine
		if (":u1f4e0:".equals(name) || ":fax:".equals(name)) return "1f4e0";
		// satellite antenna
		if (":u1f4e1:".equals(name) || ":satellite:".equals(name))
			return "1f4e1";
		// television
		if (":u1f4fa:".equals(name) || ":tv:".equals(name)) return "1f4fa";
		// radio
		if (":u1f4fb:".equals(name) || ":radio:".equals(name)) return "1f4fb";
		// speaker with three sound waves
		if (":u1f50a:".equals(name) || ":loud_sound:".equals(name))
			return "1f50a";
		// speaker with one sound wave
		if (":u1f509:".equals(name) || ":sound:".equals(name)) return "1f509";
		// speaker
		if (":u1f508:".equals(name) || ":speaker:".equals(name)) return "1f508";
		// speaker with cancellation stroke
		if (":u1f507:".equals(name) || ":mute:".equals(name)) return "1f507";
		// bell
		if (":u1f514:".equals(name) || ":bell:".equals(name)) return "1f514";
		// bell with cancellation stroke
		if (":u1f515:".equals(name) || ":no_bell:".equals(name)) return "1f515";
		// public address loudspeaker
		if (":u1f4e2:".equals(name) || ":loudspeaker:".equals(name))
			return "1f4e2";
		// cheering megaphone
		if (":u1f4e3:".equals(name) || ":mega:".equals(name)) return "1f4e3";
		// hourglass with flowing sand
		if (":u23f3:".equals(name) || ":hourglass_flowing_sand:".equals(name))
			return "23f3";
		// hourglass
		if (":u231b:".equals(name) || ":hourglass:".equals(name)) return "231b";
		// alarm clock
		if (":u23f0:".equals(name) || ":alarm_clock:".equals(name))
			return "23f0";
		// watch
		if (":u231a:".equals(name) || ":watch:".equals(name)) return "231a";
		// open lock
		if (":u1f513:".equals(name) || ":unlock:".equals(name)) return "1f513";
		// lock
		if (":u1f512:".equals(name) || ":lock:".equals(name)) return "1f512";
		// lock with ink pen
		if (":u1f50f:".equals(name) || ":lock_with_ink_pen:".equals(name))
			return "1f50f";
		// closed lock with key
		if (":u1f510:".equals(name) || ":closed_lock_with_key:".equals(name))
			return "1f510";
		// key
		if (":u1f511:".equals(name) || ":key:".equals(name)) return "1f511";
		// right-pointing magnifying glass
		if (":u1f50e:".equals(name) || ":mag_right:".equals(name))
			return "1f50e";
		// electric light bulb
		if (":u1f4a1:".equals(name) || ":bulb:".equals(name)) return "1f4a1";
		// electric torch
		if (":u1f526:".equals(name) || ":flashlight:".equals(name))
			return "1f526";
		// high brightness symbol
		if (":u1f506:".equals(name) || ":high_brightness:".equals(name))
			return "1f506";
		// low brightness symbol
		if (":u1f505:".equals(name) || ":low_brightness:".equals(name))
			return "1f505";
		// electric plug
		if (":u1f50c:".equals(name) || ":electric_plug:".equals(name))
			return "1f50c";
		// battery
		if (":u1f50b:".equals(name) || ":battery:".equals(name)) return "1f50b";
		// left-pointing magnifying glass
		if (":u1f50d:".equals(name) || ":mag:".equals(name)) return "1f50d";
		// bathtub
		if (":u1f6c1:".equals(name) || ":bathtub:".equals(name)) return "1f6c1";
		// bath
		if (":u1f6c0:".equals(name) || ":bath:".equals(name)) return "1f6c0";
		// shower
		if (":u1f6bf:".equals(name) || ":shower:".equals(name)) return "1f6bf";
		// toilet
		if (":u1f6bd:".equals(name) || ":toilet:".equals(name)) return "1f6bd";
		// wrench
		if (":u1f527:".equals(name) || ":wrench:".equals(name)) return "1f527";
		// nut and bolt
		if (":u1f529:".equals(name) || ":nut_and_bolt:".equals(name))
			return "1f529";
		// hammer
		if (":u1f528:".equals(name) || ":hammer:".equals(name)) return "1f528";
		// door
		if (":u1f6aa:".equals(name) || ":door:".equals(name)) return "1f6aa";
		// smoking symbol
		if (":u1f6ac:".equals(name) || ":smoking:".equals(name)) return "1f6ac";
		// bomb
		if (":u1f4a3:".equals(name) || ":bomb:".equals(name)) return "1f4a3";
		// pistol
		if (":u1f52b:".equals(name) || ":gun:".equals(name)) return "1f52b";
		// hocho
		if (":u1f52a:".equals(name) || ":hocho:".equals(name)
				|| ":knife:".equals(name))
			return "1f52a";
		// pill
		if (":u1f48a:".equals(name) || ":pill:".equals(name)) return "1f48a";
		// syringe
		if (":u1f489:".equals(name) || ":syringe:".equals(name)) return "1f489";
		// money bag
		if (":u1f4b0:".equals(name) || ":moneybag:".equals(name))
			return "1f4b0";
		// banknote with yen sign
		if (":u1f4b4:".equals(name) || ":yen:".equals(name)) return "1f4b4";
		// banknote with dollar sign
		if (":u1f4b5:".equals(name) || ":dollar:".equals(name)) return "1f4b5";
		// banknote with pound sign
		if (":u1f4b7:".equals(name) || ":pound:".equals(name)) return "1f4b7";
		// banknote with euro sign
		if (":u1f4b6:".equals(name) || ":euro:".equals(name)) return "1f4b6";
		// credit card
		if (":u1f4b3:".equals(name) || ":credit_card:".equals(name))
			return "1f4b3";
		// money with wings
		if (":u1f4b8:".equals(name) || ":money_with_wings:".equals(name))
			return "1f4b8";
		// mobile phone with rightwards arrow at left
		if (":u1f4f2:".equals(name) || ":calling:".equals(name)) return "1f4f2";
		// e-mail symbol
		if (":u1f4e7:".equals(name) || ":e-mail:".equals(name)) return "1f4e7";
		// inbox tray
		if (":u1f4e5:".equals(name) || ":inbox_tray:".equals(name))
			return "1f4e5";
		// outbox tray
		if (":u1f4e4:".equals(name) || ":outbox_tray:".equals(name))
			return "1f4e4";
		// envelope
		if (":u2709:".equals(name) || ":email:".equals(name)
				|| ":envelope:".equals(name))
			return "2709";
		// envelope with downwards arrow above
		if (":u1f4e9:".equals(name) || ":envelope_with_arrow:".equals(name))
			return "1f4e9";
		// incoming envelope
		if (":u1f4e8:".equals(name) || ":incoming_envelope:".equals(name))
			return "1f4e8";
		// postal horn
		if (":u1f4ef:".equals(name) || ":postal_horn:".equals(name))
			return "1f4ef";
		// closed mailbox with raised flag
		if (":u1f4eb:".equals(name) || ":mailbox:".equals(name)) return "1f4eb";
		// closed mailbox with lowered flag
		if (":u1f4ea:".equals(name) || ":mailbox_closed:".equals(name))
			return "1f4ea";
		// open mailbox with raised flag
		if (":u1f4ec:".equals(name) || ":mailbox_with_mail:".equals(name))
			return "1f4ec";
		// open mailbox with lowered flag
		if (":u1f4ed:".equals(name) || ":mailbox_with_no_mail:".equals(name))
			return "1f4ed";
		// postbox
		if (":u1f4ee:".equals(name) || ":postbox:".equals(name)) return "1f4ee";
		// package
		if (":u1f4e6:".equals(name) || ":package:".equals(name)) return "1f4e6";
		// memo
		if (":u1f4dd:".equals(name) || ":memo:".equals(name)
				|| ":pencil:".equals(name))
			return "1f4dd";
		// page facing up
		if (":u1f4c4:".equals(name) || ":page_facing_up:".equals(name))
			return "1f4c4";
		// page with curl
		if (":u1f4c3:".equals(name) || ":page_with_curl:".equals(name))
			return "1f4c3";
		// bookmark tabs
		if (":u1f4d1:".equals(name) || ":bookmark_tabs:".equals(name))
			return "1f4d1";
		// bar chart
		if (":u1f4ca:".equals(name) || ":bar_chart:".equals(name))
			return "1f4ca";
		// chart with upwards trend
		if (":u1f4c8:".equals(name)
				|| ":chart_with_upwards_trend:".equals(name))
			return "1f4c8";
		// chart with downwards trend
		if (":u1f4c9:".equals(name)
				|| ":chart_with_downwards_trend:".equals(name))
			return "1f4c9";
		// scroll
		if (":u1f4dc:".equals(name) || ":scroll:".equals(name)) return "1f4dc";
		// clipboard
		if (":u1f4cb:".equals(name) || ":clipboard:".equals(name))
			return "1f4cb";
		// calendar
		if (":u1f4c5:".equals(name) || ":date:".equals(name)) return "1f4c5";
		// tear-off calendar
		if (":u1f4c6:".equals(name) || ":calendar:".equals(name))
			return "1f4c6";
		// card index
		if (":u1f4c7:".equals(name) || ":card_index:".equals(name))
			return "1f4c7";
		// file folder
		if (":u1f4c1:".equals(name) || ":file_folder:".equals(name))
			return "1f4c1";
		// open file folder
		if (":u1f4c2:".equals(name) || ":open_file_folder:".equals(name))
			return "1f4c2";
		// black scissors
		if (":u2702:".equals(name) || ":scissors:".equals(name)) return "2702";
		// pushpin
		if (":u1f4cc:".equals(name) || ":pushpin:".equals(name)) return "1f4cc";
		// paperclip
		if (":u1f4ce:".equals(name) || ":paperclip:".equals(name))
			return "1f4ce";
		// black nib
		if (":u2712:".equals(name) || ":black_nib:".equals(name)) return "2712";
		// pencil
		if (":u270f:".equals(name) || ":pencil2:".equals(name)) return "270f";
		// straight ruler
		if (":u1f4cf:".equals(name) || ":straight_ruler:".equals(name))
			return "1f4cf";
		// triangular ruler
		if (":u1f4d0:".equals(name) || ":triangular_ruler:".equals(name))
			return "1f4d0";
		// closed book
		if (":u1f4d5:".equals(name) || ":closed_book:".equals(name))
			return "1f4d5";
		// green book
		if (":u1f4d7:".equals(name) || ":green_book:".equals(name))
			return "1f4d7";
		// blue book
		if (":u1f4d8:".equals(name) || ":blue_book:".equals(name))
			return "1f4d8";
		// orange book
		if (":u1f4d9:".equals(name) || ":orange_book:".equals(name))
			return "1f4d9";
		// notebook
		if (":u1f4d3:".equals(name) || ":notebook:".equals(name))
			return "1f4d3";
		// notebook with decorative cover
		if (":u1f4d4:".equals(name)
				|| ":notebook_with_decorative_cover:".equals(name))
			return "1f4d4";
		// ledger
		if (":u1f4d2:".equals(name) || ":ledger:".equals(name)) return "1f4d2";
		// books
		if (":u1f4da:".equals(name) || ":books:".equals(name)) return "1f4da";
		// open book
		if (":u1f4d6:".equals(name) || ":book:".equals(name)
				|| ":open_book:".equals(name))
			return "1f4d6";
		// bookmark
		if (":u1f516:".equals(name) || ":bookmark:".equals(name))
			return "1f516";
		// name badge
		if (":u1f4db:".equals(name) || ":name_badge:".equals(name))
			return "1f4db";
		// microscope
		if (":u1f52c:".equals(name) || ":microscope:".equals(name))
			return "1f52c";
		// telescope
		if (":u1f52d:".equals(name) || ":telescope:".equals(name))
			return "1f52d";
		// newspaper
		if (":u1f4f0:".equals(name) || ":newspaper:".equals(name))
			return "1f4f0";
		// artist palette
		if (":u1f3a8:".equals(name) || ":art:".equals(name)) return "1f3a8";
		// clapper board
		if (":u1f3ac:".equals(name) || ":clapper:".equals(name)) return "1f3ac";
		// microphone
		if (":u1f3a4:".equals(name) || ":microphone:".equals(name))
			return "1f3a4";
		// headphone
		if (":u1f3a7:".equals(name) || ":headphones:".equals(name))
			return "1f3a7";
		// musical score
		if (":u1f3bc:".equals(name) || ":musical_score:".equals(name))
			return "1f3bc";
		// musical note
		if (":u1f3b5:".equals(name) || ":musical_note:".equals(name))
			return "1f3b5";
		// multiple musical notes
		if (":u1f3b6:".equals(name) || ":notes:".equals(name)) return "1f3b6";
		// musical keyboard
		if (":u1f3b9:".equals(name) || ":musical_keyboard:".equals(name))
			return "1f3b9";
		// violin
		if (":u1f3bb:".equals(name) || ":violin:".equals(name)) return "1f3bb";
		// trumpet
		if (":u1f3ba:".equals(name) || ":trumpet:".equals(name)) return "1f3ba";
		// saxophone
		if (":u1f3b7:".equals(name) || ":saxophone:".equals(name))
			return "1f3b7";
		// guitar
		if (":u1f3b8:".equals(name) || ":guitar:".equals(name)) return "1f3b8";
		// alien monster
		if (":u1f47e:".equals(name) || ":space_invader:".equals(name))
			return "1f47e";
		// video game
		if (":u1f3ae:".equals(name) || ":video_game:".equals(name))
			return "1f3ae";
		// playing card black joker
		if (":u1f0cf:".equals(name) || ":black_joker:".equals(name))
			return "1f0cf";
		// flower playing cards
		if (":u1f3b4:".equals(name) || ":flower_playing_cards:".equals(name))
			return "1f3b4";
		// mahjong tile red dragon
		if (":u1f004:".equals(name) || ":mahjong:".equals(name)) return "1f004";
		// game die
		if (":u1f3b2:".equals(name) || ":game_die:".equals(name))
			return "1f3b2";
		// direct hit
		if (":u1f3af:".equals(name) || ":dart:".equals(name)) return "1f3af";
		// american football
		if (":u1f3c8:".equals(name) || ":football:".equals(name))
			return "1f3c8";
		// basketball and hoop
		if (":u1f3c0:".equals(name) || ":basketball:".equals(name))
			return "1f3c0";
		// soccer ball
		if (":u26bd:".equals(name) || ":soccer:".equals(name)) return "26bd";
		// baseball
		if (":u26be:".equals(name) || ":baseball:".equals(name)) return "26be";
		// tennis racquet and ball
		if (":u1f3be:".equals(name) || ":tennis:".equals(name)) return "1f3be";
		// billiards
		if (":u1f3b1:".equals(name) || ":8ball:".equals(name)) return "1f3b1";
		// rugby football
		if (":u1f3c9:".equals(name) || ":rugby_football:".equals(name))
			return "1f3c9";
		// bowling
		if (":u1f3b3:".equals(name) || ":bowling:".equals(name)) return "1f3b3";
		// flag in hole
		if (":u26f3:".equals(name) || ":golf:".equals(name)) return "26f3";
		// mountain bicyclist
		if (":u1f6b5:".equals(name) || ":mountain_bicyclist:".equals(name))
			return "1f6b5";
		// bicyclist
		if (":u1f6b4:".equals(name) || ":bicyclist:".equals(name))
			return "1f6b4";
		// chequered flag
		if (":u1f3c1:".equals(name) || ":checkered_flag:".equals(name))
			return "1f3c1";
		// horse racing
		if (":u1f3c7:".equals(name) || ":horse_racing:".equals(name))
			return "1f3c7";
		// trophy
		if (":u1f3c6:".equals(name) || ":trophy:".equals(name)) return "1f3c6";
		// ski and ski boot
		if (":u1f3bf:".equals(name) || ":ski:".equals(name)) return "1f3bf";
		// snowboarder
		if (":u1f3c2:".equals(name) || ":snowboarder:".equals(name))
			return "1f3c2";
		// swimmer
		if (":u1f3ca:".equals(name) || ":swimmer:".equals(name)) return "1f3ca";
		// surfer
		if (":u1f3c4:".equals(name) || ":surfer:".equals(name)) return "1f3c4";
		// fishing pole and fish
		if (":u1f3a3:".equals(name) || ":fishing_pole_and_fish:".equals(name))
			return "1f3a3";
		// hot beverage
		if (":u2615:".equals(name) || ":coffee:".equals(name)) return "2615";
		// teacup without handle
		if (":u1f375:".equals(name) || ":tea:".equals(name)) return "1f375";
		// sake bottle and cup
		if (":u1f376:".equals(name) || ":sake:".equals(name)) return "1f376";
		// baby bottle
		if (":u1f37c:".equals(name) || ":baby_bottle:".equals(name))
			return "1f37c";
		// beer mug
		if (":u1f37a:".equals(name) || ":beer:".equals(name)) return "1f37a";
		// clinking beer mugs
		if (":u1f37b:".equals(name) || ":beers:".equals(name)) return "1f37b";
		// cocktail glass
		if (":u1f378:".equals(name) || ":cocktail:".equals(name))
			return "1f378";
		// tropical drink
		if (":u1f379:".equals(name) || ":tropical_drink:".equals(name))
			return "1f379";
		// wine glass
		if (":u1f377:".equals(name) || ":wine_glass:".equals(name))
			return "1f377";
		// fork and knife
		if (":u1f374:".equals(name) || ":fork_and_knife:".equals(name))
			return "1f374";
		// slice of pizza
		if (":u1f355:".equals(name) || ":pizza:".equals(name)) return "1f355";
		// hamburger
		if (":u1f354:".equals(name) || ":hamburger:".equals(name))
			return "1f354";
		// french fries
		if (":u1f35f:".equals(name) || ":fries:".equals(name)) return "1f35f";
		// poultry leg
		if (":u1f357:".equals(name) || ":poultry_leg:".equals(name))
			return "1f357";
		// meat on bone
		if (":u1f356:".equals(name) || ":meat_on_bone:".equals(name))
			return "1f356";
		// spaghetti
		if (":u1f35d:".equals(name) || ":spaghetti:".equals(name))
			return "1f35d";
		// curry and rice
		if (":u1f35b:".equals(name) || ":curry:".equals(name)) return "1f35b";
		// fried shrimp
		if (":u1f364:".equals(name) || ":fried_shrimp:".equals(name))
			return "1f364";
		// bento box
		if (":u1f371:".equals(name) || ":bento:".equals(name)) return "1f371";
		// sushi
		if (":u1f363:".equals(name) || ":sushi:".equals(name)) return "1f363";
		// fish cake with swirl design
		if (":u1f365:".equals(name) || ":fish_cake:".equals(name))
			return "1f365";
		// rice ball
		if (":u1f359:".equals(name) || ":rice_ball:".equals(name))
			return "1f359";
		// rice cracker
		if (":u1f358:".equals(name) || ":rice_cracker:".equals(name))
			return "1f358";
		// cooked rice
		if (":u1f35a:".equals(name) || ":rice:".equals(name)) return "1f35a";
		// steaming bowl
		if (":u1f35c:".equals(name) || ":ramen:".equals(name)) return "1f35c";
		// pot of food
		if (":u1f372:".equals(name) || ":stew:".equals(name)) return "1f372";
		// oden
		if (":u1f362:".equals(name) || ":oden:".equals(name)) return "1f362";
		// dango
		if (":u1f361:".equals(name) || ":dango:".equals(name)) return "1f361";
		// cooking
		if (":u1f373:".equals(name) || ":egg:".equals(name)) return "1f373";
		// bread
		if (":u1f35e:".equals(name) || ":bread:".equals(name)) return "1f35e";
		// doughnut
		if (":u1f369:".equals(name) || ":doughnut:".equals(name))
			return "1f369";
		// custard
		if (":u1f36e:".equals(name) || ":custard:".equals(name)) return "1f36e";
		// soft ice cream
		if (":u1f366:".equals(name) || ":icecream:".equals(name))
			return "1f366";
		// ice cream
		if (":u1f368:".equals(name) || ":ice_cream:".equals(name))
			return "1f368";
		// shaved ice
		if (":u1f367:".equals(name) || ":shaved_ice:".equals(name))
			return "1f367";
		// birthday cake
		if (":u1f382:".equals(name) || ":birthday:".equals(name))
			return "1f382";
		// shortcake
		if (":u1f370:".equals(name) || ":cake:".equals(name)) return "1f370";
		// cookie
		if (":u1f36a:".equals(name) || ":cookie:".equals(name)) return "1f36a";
		// chocolate bar
		if (":u1f36b:".equals(name) || ":chocolate_bar:".equals(name))
			return "1f36b";
		// candy
		if (":u1f36c:".equals(name) || ":candy:".equals(name)) return "1f36c";
		// lollipop
		if (":u1f36d:".equals(name) || ":lollipop:".equals(name))
			return "1f36d";
		// honey pot
		if (":u1f36f:".equals(name) || ":honey_pot:".equals(name))
			return "1f36f";
		// red apple
		if (":u1f34e:".equals(name) || ":apple:".equals(name)) return "1f34e";
		// green apple
		if (":u1f34f:".equals(name) || ":green_apple:".equals(name))
			return "1f34f";
		// tangerine
		if (":u1f34a:".equals(name) || ":tangerine:".equals(name))
			return "1f34a";
		// lemon
		if (":u1f34b:".equals(name) || ":lemon:".equals(name)) return "1f34b";
		// cherries
		if (":u1f352:".equals(name) || ":cherries:".equals(name))
			return "1f352";
		// grapes
		if (":u1f347:".equals(name) || ":grapes:".equals(name)) return "1f347";
		// watermelon
		if (":u1f349:".equals(name) || ":watermelon:".equals(name))
			return "1f349";
		// strawberry
		if (":u1f353:".equals(name) || ":strawberry:".equals(name))
			return "1f353";
		// peach
		if (":u1f351:".equals(name) || ":peach:".equals(name)) return "1f351";
		// melon
		if (":u1f348:".equals(name) || ":melon:".equals(name)) return "1f348";
		// banana
		if (":u1f34c:".equals(name) || ":banana:".equals(name)) return "1f34c";
		// pear
		if (":u1f350:".equals(name) || ":pear:".equals(name)) return "1f350";
		// pineapple
		if (":u1f34d:".equals(name) || ":pineapple:".equals(name))
			return "1f34d";
		// roasted sweet potato
		if (":u1f360:".equals(name) || ":sweet_potato:".equals(name))
			return "1f360";
		// aubergine
		if (":u1f346:".equals(name) || ":eggplant:".equals(name))
			return "1f346";
		// tomato
		if (":u1f345:".equals(name) || ":tomato:".equals(name)) return "1f345";
		// ear of maize
		if (":u1f33d:".equals(name) || ":corn:".equals(name)) return "1f33d";
		// house building
		if (":u1f3e0:".equals(name) || ":house:".equals(name)) return "1f3e0";
		// house with garden
		if (":u1f3e1:".equals(name) || ":house_with_garden:".equals(name))
			return "1f3e1";
		// school
		if (":u1f3eb:".equals(name) || ":school:".equals(name)) return "1f3eb";
		// office building
		if (":u1f3e2:".equals(name) || ":office:".equals(name)) return "1f3e2";
		// japanese post office
		if (":u1f3e3:".equals(name) || ":post_office:".equals(name))
			return "1f3e3";
		// hospital
		if (":u1f3e5:".equals(name) || ":hospital:".equals(name))
			return "1f3e5";
		// bank
		if (":u1f3e6:".equals(name) || ":bank:".equals(name)) return "1f3e6";
		// convenience store
		if (":u1f3ea:".equals(name) || ":convenience_store:".equals(name))
			return "1f3ea";
		// love hotel
		if (":u1f3e9:".equals(name) || ":love_hotel:".equals(name))
			return "1f3e9";
		// hotel
		if (":u1f3e8:".equals(name) || ":hotel:".equals(name)) return "1f3e8";
		// wedding
		if (":u1f492:".equals(name) || ":wedding:".equals(name)) return "1f492";
		// church
		if (":u26ea:".equals(name) || ":church:".equals(name)) return "26ea";
		// department store
		if (":u1f3ec:".equals(name) || ":department_store:".equals(name))
			return "1f3ec";
		// european post office
		if (":u1f3e4:".equals(name) || ":european_post_office:".equals(name))
			return "1f3e4";
		// sunset over buildings
		if (":u1f307:".equals(name) || ":city_sunrise:".equals(name))
			return "1f307";
		// cityscape at dusk
		if (":u1f306:".equals(name) || ":city_sunset:".equals(name))
			return "1f306";
		// japanese castle
		if (":u1f3ef:".equals(name) || ":japanese_castle:".equals(name))
			return "1f3ef";
		// european castle
		if (":u1f3f0:".equals(name) || ":european_castle:".equals(name))
			return "1f3f0";
		// tent
		if (":u26fa:".equals(name) || ":tent:".equals(name)) return "26fa";
		// factory
		if (":u1f3ed:".equals(name) || ":factory:".equals(name)) return "1f3ed";
		// tokyo tower
		if (":u1f5fc:".equals(name) || ":tokyo_tower:".equals(name))
			return "1f5fc";
		// silhouette of japan
		if (":u1f5fe:".equals(name) || ":japan:".equals(name)) return "1f5fe";
		// mount fuji
		if (":u1f5fb:".equals(name) || ":mount_fuji:".equals(name))
			return "1f5fb";
		// sunrise over mountains
		if (":u1f304:".equals(name) || ":sunrise_over_mountains:".equals(name))
			return "1f304";
		// sunrise
		if (":u1f305:".equals(name) || ":sunrise:".equals(name)) return "1f305";
		// night with stars
		if (":u1f303:".equals(name) || ":night_with_stars:".equals(name))
			return "1f303";
		// statue of liberty
		if (":u1f5fd:".equals(name) || ":statue_of_liberty:".equals(name))
			return "1f5fd";
		// bridge at night
		if (":u1f309:".equals(name) || ":bridge_at_night:".equals(name))
			return "1f309";
		// carousel horse
		if (":u1f3a0:".equals(name) || ":carousel_horse:".equals(name))
			return "1f3a0";
		// ferris wheel
		if (":u1f3a1:".equals(name) || ":ferris_wheel:".equals(name))
			return "1f3a1";
		// fountain
		if (":u26f2:".equals(name) || ":fountain:".equals(name)) return "26f2";
		// roller coaster
		if (":u1f3a2:".equals(name) || ":roller_coaster:".equals(name))
			return "1f3a2";
		// ship
		if (":u1f6a2:".equals(name) || ":ship:".equals(name)) return "1f6a2";
		// sailboat
		if (":u26f5:".equals(name) || ":boat:".equals(name)
				|| ":sailboat:".equals(name))
			return "26f5";
		// speedboat
		if (":u1f6a4:".equals(name) || ":speedboat:".equals(name))
			return "1f6a4";
		// rowboat
		if (":u1f6a3:".equals(name) || ":rowboat:".equals(name)) return "1f6a3";
		// anchor
		if (":u2693:".equals(name) || ":anchor:".equals(name)) return "2693";
		// rocket
		if (":u1f680:".equals(name) || ":rocket:".equals(name)) return "1f680";
		// airplane
		if (":u2708:".equals(name) || ":airplane:".equals(name)) return "2708";
		// seat
		if (":u1f4ba:".equals(name) || ":seat:".equals(name)) return "1f4ba";
		// helicopter
		if (":u1f681:".equals(name) || ":helicopter:".equals(name))
			return "1f681";
		// steam locomotive
		if (":u1f682:".equals(name) || ":steam_locomotive:".equals(name))
			return "1f682";
		// tram
		if (":u1f68a:".equals(name) || ":tram:".equals(name)) return "1f68a";
		// station
		if (":u1f689:".equals(name) || ":station:".equals(name)) return "1f689";
		// mountain railway
		if (":u1f69e:".equals(name) || ":mountain_railway:".equals(name))
			return "1f69e";
		// train
		if (":u1f686:".equals(name) || ":train2:".equals(name)) return "1f686";
		// high-speed train
		if (":u1f684:".equals(name) || ":bullettrain_side:".equals(name))
			return "1f684";
		// high-speed train with bullet nose
		if (":u1f685:".equals(name) || ":bullettrain_front:".equals(name))
			return "1f685";
		// light rail
		if (":u1f688:".equals(name) || ":light_rail:".equals(name))
			return "1f688";
		// metro
		if (":u1f687:".equals(name) || ":metro:".equals(name)) return "1f687";
		// monorail
		if (":u1f69d:".equals(name) || ":monorail:".equals(name))
			return "1f69d";
		// tram car
		if (":u1f68b:".equals(name) || ":train:".equals(name)) return "1f68b";
		// railway car
		if (":u1f683:".equals(name) || ":railway_car:".equals(name))
			return "1f683";
		// trolleybus
		if (":u1f68e:".equals(name) || ":trolleybus:".equals(name))
			return "1f68e";
		// bus
		if (":u1f68c:".equals(name) || ":bus:".equals(name)) return "1f68c";
		// oncoming bus
		if (":u1f68d:".equals(name) || ":oncoming_bus:".equals(name))
			return "1f68d";
		// recreational vehicle
		if (":u1f699:".equals(name) || ":blue_car:".equals(name))
			return "1f699";
		// oncoming automobile
		if (":u1f698:".equals(name) || ":oncoming_automobile:".equals(name))
			return "1f698";
		// automobile
		if (":u1f697:".equals(name) || ":car:".equals(name)
				|| ":red_car:".equals(name))
			return "1f697";
		// taxi
		if (":u1f695:".equals(name) || ":taxi:".equals(name)) return "1f695";
		// oncoming taxi
		if (":u1f696:".equals(name) || ":oncoming_taxi:".equals(name))
			return "1f696";
		// articulated lorry
		if (":u1f69b:".equals(name) || ":articulated_lorry:".equals(name))
			return "1f69b";
		// delivery truck
		if (":u1f69a:".equals(name) || ":truck:".equals(name)) return "1f69a";
		// police cars revolving light
		if (":u1f6a8:".equals(name) || ":rotating_light:".equals(name))
			return "1f6a8";
		// police car
		if (":u1f693:".equals(name) || ":police_car:".equals(name))
			return "1f693";
		// oncoming police car
		if (":u1f694:".equals(name) || ":oncoming_police_car:".equals(name))
			return "1f694";
		// fire engine
		if (":u1f692:".equals(name) || ":fire_engine:".equals(name))
			return "1f692";
		// ambulance
		if (":u1f691:".equals(name) || ":ambulance:".equals(name))
			return "1f691";
		// minibus
		if (":u1f690:".equals(name) || ":minibus:".equals(name)) return "1f690";
		// bicycle
		if (":u1f6b2:".equals(name) || ":bike:".equals(name)) return "1f6b2";
		// aerial tramway
		if (":u1f6a1:".equals(name) || ":aerial_tramway:".equals(name))
			return "1f6a1";
		// suspension railway
		if (":u1f69f:".equals(name) || ":suspension_railway:".equals(name))
			return "1f69f";
		// mountain cableway
		if (":u1f6a0:".equals(name) || ":mountain_cableway:".equals(name))
			return "1f6a0";
		// tractor
		if (":u1f69c:".equals(name) || ":tractor:".equals(name)) return "1f69c";
		// barber pole
		if (":u1f488:".equals(name) || ":barber:".equals(name)) return "1f488";
		// bus stop
		if (":u1f68f:".equals(name) || ":busstop:".equals(name)) return "1f68f";
		// ticket
		if (":u1f3ab:".equals(name) || ":ticket:".equals(name)) return "1f3ab";
		// vertical traffic light
		if (":u1f6a6:".equals(name) || ":vertical_traffic_light:".equals(name))
			return "1f6a6";
		// horizontal traffic light
		if (":u1f6a5:".equals(name) || ":traffic_light:".equals(name))
			return "1f6a5";
		// warning sign
		if (":u26a0:".equals(name) || ":warning:".equals(name)) return "26a0";
		// construction sign
		if (":u1f6a7:".equals(name) || ":construction:".equals(name))
			return "1f6a7";
		// japanese symbol for beginner
		if (":u1f530:".equals(name) || ":beginner:".equals(name))
			return "1f530";
		// fuel pump
		if (":u26fd:".equals(name) || ":fuelpump:".equals(name)) return "26fd";
		// izakaya lantern
		if (":u1f3ee:".equals(name) || ":izakaya_lantern:".equals(name)
				|| ":lantern:".equals(name))
			return "1f3ee";
		// slot machine
		if (":u1f3b0:".equals(name) || ":slot_machine:".equals(name))
			return "1f3b0";
		// hot springs
		if (":u2668:".equals(name) || ":hotsprings:".equals(name))
			return "2668";
		// moyai
		if (":u1f5ff:".equals(name) || ":moyai:".equals(name)) return "1f5ff";
		// circus tent
		if (":u1f3aa:".equals(name) || ":circus_tent:".equals(name))
			return "1f3aa";
		// performing arts
		if (":u1f3ad:".equals(name) || ":performing_arts:".equals(name))
			return "1f3ad";
		// round pushpin
		if (":u1f4cd:".equals(name) || ":round_pushpin:".equals(name))
			return "1f4cd";
		// triangular flag on post
		if (":u1f6a9:".equals(name) || ":triangular_flag_on_post:".equals(name))
			return "1f6a9";
		// regional indicator symbol letter j + regional indicator symbol letter p
		if (":u1f1ef_1f1f5:".equals(name) || ":jp:".equals(name))
			return "1f1ef_1f1f5";
		// regional indicator symbol letter k + regional indicator symbol letter r
		if (":u1f1f0_1f1f7:".equals(name) || ":kr:".equals(name))
			return "1f1f0_1f1f7";
		// regional indicator symbol letter d + regional indicator symbol letter e
		if (":u1f1e9_1f1ea:".equals(name) || ":de:".equals(name))
			return "1f1e9_1f1ea";
		// regional indicator symbol letter c + regional indicator symbol letter n
		if (":u1f1e8_1f1f3:".equals(name) || ":cn:".equals(name))
			return "1f1e8_1f1f3";
		// regional indicator symbol letter u + regional indicator symbol letter s
		if (":u1f1fa_1f1f8:".equals(name) || ":us:".equals(name))
			return "1f1fa_1f1f8";
		// regional indicator symbol letter f + regional indicator symbol letter r
		if (":u1f1eb_1f1f7:".equals(name) || ":fr:".equals(name))
			return "1f1eb_1f1f7";
		// regional indicator symbol letter e + regional indicator symbol letter s
		if (":u1f1ea_1f1f8:".equals(name) || ":es:".equals(name))
			return "1f1ea_1f1f8";
		// regional indicator symbol letter i + regional indicator symbol letter t
		if (":u1f1ee_1f1f9:".equals(name) || ":it:".equals(name))
			return "1f1ee_1f1f9";
		// regional indicator symbol letter r + regional indicator symbol letter u
		if (":u1f1f7_1f1fa:".equals(name) || ":ru:".equals(name))
			return "1f1f7_1f1fa";
		// regional indicator symbol letter g + regional indicator symbol letter b
		if (":u1f1ec_1f1e7:".equals(name) || ":gb:".equals(name)
				|| ":uk:".equals(name))
			return "1f1ec_1f1e7";
		// digit one + combining enclosing keycap
		if (":u0031_20e3:".equals(name) || ":one:".equals(name))
			return "0031_20e3";
		// digit two + combining enclosing keycap
		if (":u0032_20e3:".equals(name) || ":two:".equals(name))
			return "0032_20e3";
		// digit three + combining enclosing keycap
		if (":u0033_20e3:".equals(name) || ":three:".equals(name))
			return "0033_20e3";
		// digit four + combining enclosing keycap
		if (":u0034_20e3:".equals(name) || ":four:".equals(name))
			return "0034_20e3";
		// digit five + combining enclosing keycap
		if (":u0035_20e3:".equals(name) || ":five:".equals(name))
			return "0035_20e3";
		// digit six + combining enclosing keycap
		if (":u0036_20e3:".equals(name) || ":six:".equals(name))
			return "003620e3";
		// digit seven + combining enclosing keycap
		if (":u0036_20e3:".equals(name) || ":seven:".equals(name))
			return "003720e3";
		// digit eight + combining enclosing keycap
		if (":u0038_20e3:".equals(name) || ":eight:".equals(name))
			return "0038_20e3";
		// digit nine + combining enclosing keycap
		if (":u0039_20e3:".equals(name) || ":nine:".equals(name))
			return "0039_20e3";
		// digit zero + combining enclosing keycap
		if (":u0030_20e3:".equals(name) || ":zero:".equals(name))
			return "0030_20e3";
		// keycap ten
		if (":u1f51f:".equals(name) || ":keycap_ten:".equals(name))
			return "1f51f";
		// input symbol for numbers
		if (":u1f522:".equals(name) || ":1234:".equals(name)) return "1f522";
		// number sign + combining enclosing keycap
		if (":u0023_20e3:".equals(name) || ":hash:".equals(name))
			return "0023_20e3";
		// input symbol for symbols
		if (":u1f523:".equals(name) || ":symbols:".equals(name)) return "1f523";
		// upwards black arrow
		if (":u2b06:".equals(name) || ":arrow_up:".equals(name)) return "2b06";
		// downwards black arrow
		if (":u2b07:".equals(name) || ":arrow_down:".equals(name))
			return "2b07";
		// leftwards black arrow
		if (":u2b05:".equals(name) || ":arrow_left:".equals(name))
			return "2b05";
		// black rightwards arrow
		if (":u27a1:".equals(name) || ":arrow_right:".equals(name))
			return "27a1";
		// input symbol for latin capital letters
		if (":u1f520:".equals(name) || ":capital_abcd:".equals(name))
			return "1f520";
		// input symbol for latin small letters
		if (":u1f521:".equals(name) || ":abcd:".equals(name)) return "1f521";
		// input symbol for latin letters
		if (":u1f524:".equals(name) || ":abc:".equals(name)) return "1f524";
		// north east arrow
		if (":u2197:".equals(name) || ":arrow_upper_right:".equals(name))
			return "2197";
		// north west arrow
		if (":u2196:".equals(name) || ":arrow_upper_left:".equals(name))
			return "2196";
		// south east arrow
		if (":u2198:".equals(name) || ":arrow_lower_right:".equals(name))
			return "2198";
		// south west arrow
		if (":u2199:".equals(name) || ":arrow_lower_left:".equals(name))
			return "2199";
		// left right arrow
		if (":u2194:".equals(name) || ":left_right_arrow:".equals(name))
			return "2194";
		// up down arrow
		if (":u2195:".equals(name) || ":arrow_up_down:".equals(name))
			return "2195";
		// anticlockwise downwards and upwards open circle arrows
		if (":u1f504:".equals(name) || ":arrows_counterclockwise:".equals(name))
			return "1f504";
		// black left-pointing triangle
		if (":u25c0:".equals(name) || ":arrow_backward:".equals(name))
			return "25c0";
		// black right-pointing triangle
		if (":u25b6:".equals(name) || ":arrow_forward:".equals(name))
			return "25b6";
		// up-pointing small red triangle
		if (":u1f53c:".equals(name) || ":arrow_up_small:".equals(name))
			return "1f53c";
		// down-pointing small red triangle
		if (":u1f53d:".equals(name) || ":arrow_down_small:".equals(name))
			return "1f53d";
		// leftwards arrow with hook
		if (":u21a9:".equals(name)
				|| ":leftwards_arrow_with_hook:".equals(name))
			return "21a9";
		// rightwards arrow with hook
		if (":u21aa:".equals(name) || ":arrow_right_hook:".equals(name))
			return "21aa";
		// information source
		if (":u2139:".equals(name) || ":information_source:".equals(name))
			return "2139";
		// black left-pointing double triangle
		if (":u23ea:".equals(name) || ":rewind:".equals(name)) return "23ea";
		// black right-pointing double triangle
		if (":u23e9:".equals(name) || ":fast_forward:".equals(name))
			return "23e9";
		// black up-pointing double triangle
		if (":u23eb:".equals(name) || ":arrow_double_up:".equals(name))
			return "23eb";
		// black down-pointing double triangle
		if (":u23ec:".equals(name) || ":arrow_double_down:".equals(name))
			return "23ec";
		// arrow pointing rightwards then curving downwards
		if (":u2935:".equals(name) || ":arrow_heading_down:".equals(name))
			return "2935";
		// arrow pointing rightwards then curving upwards
		if (":u2934:".equals(name) || ":arrow_heading_up:".equals(name))
			return "2934";
		// squared ok
		if (":u1f197:".equals(name) || ":ok:".equals(name)) return "1f197";
		// twisted rightwards arrows
		if (":u1f500:".equals(name)
				|| ":twisted_rightwards_arrows:".equals(name))
			return "1f500";
		// clockwise rightwards and leftwards open circle arrows
		if (":u1f501:".equals(name) || ":repeat:".equals(name)) return "1f501";
		// clockwise rightwards and leftwards open circle arrows with circled one overlay
		if (":u1f502:".equals(name) || ":repeat_one:".equals(name))
			return "1f502";
		// squared new
		if (":u1f195:".equals(name) || ":new:".equals(name)) return "1f195";
		// squared up with exclamation mark
		if (":u1f199:".equals(name) || ":up:".equals(name)) return "1f199";
		// squared cool
		if (":u1f192:".equals(name) || ":cool:".equals(name)) return "1f192";
		// squared free
		if (":u1f193:".equals(name) || ":free:".equals(name)) return "1f193";
		// squared ng
		if (":u1f196:".equals(name) || ":ng:".equals(name)) return "1f196";
		// antenna with bars
		if (":u1f4f6:".equals(name) || ":signal_strength:".equals(name))
			return "1f4f6";
		// cinema
		if (":u1f3a6:".equals(name) || ":cinema:".equals(name)) return "1f3a6";
		// squared katakana koko
		if (":u1f201:".equals(name) || ":koko:".equals(name)) return "1f201";
		// squared cjk unified ideograph-6307
		if (":u1f22f:".equals(name) || ":u6307:".equals(name)) return "1f22f";
		// squared cjk unified ideograph-7a7a
		if (":u1f233:".equals(name) || ":u7a7a:".equals(name)) return "1f233";
		// squared cjk unified ideograph-6e80
		if (":u1f235:".equals(name) || ":u6e80:".equals(name)) return "1f235";
		// squared cjk unified ideograph-5408
		if (":u1f234:".equals(name) || ":u5408:".equals(name)) return "1f234";
		// squared cjk unified ideograph-7981
		if (":u1f232:".equals(name) || ":u7981:".equals(name)) return "1f232";
		// circled ideograph advantage
		if (":u1f250:".equals(name) || ":ideograph_advantage:".equals(name))
			return "1f250";
		// squared cjk unified ideograph-5272
		if (":u1f239:".equals(name) || ":u5272:".equals(name)) return "1f239";
		// squared cjk unified ideograph-55b6
		if (":u1f23a:".equals(name) || ":u55b6:".equals(name)) return "1f23a";
		// squared cjk unified ideograph-6709
		if (":u1f236:".equals(name) || ":u6709:".equals(name)) return "1f236";
		// squared cjk unified ideograph-7121
		if (":u1f21a:".equals(name) || ":u7121:".equals(name)) return "1f21a";
		// restroom
		if (":u1f6bb:".equals(name) || ":restroom:".equals(name))
			return "1f6bb";
		// mens symbol
		if (":u1f6b9:".equals(name) || ":mens:".equals(name)) return "1f6b9";
		// womens symbol
		if (":u1f6ba:".equals(name) || ":womens:".equals(name)) return "1f6ba";
		// baby symbol
		if (":u1f6bc:".equals(name) || ":baby_symbol:".equals(name))
			return "1f6bc";
		// water closet
		if (":u1f6be:".equals(name) || ":wc:".equals(name)) return "1f6be";
		// potable water symbol
		if (":u1f6b0:".equals(name) || ":potable_water:".equals(name))
			return "1f6b0";
		// put litter in its place symbol
		if (":u1f6ae:".equals(name) || ":put_litter_in_its_place:".equals(name))
			return "1f6ae";
		// negative squared latin capital letter p
		if (":u1f17f:".equals(name) || ":parking:".equals(name)) return "1f17f";
		// wheelchair symbol
		if (":u267f:".equals(name) || ":wheelchair:".equals(name))
			return "267f";
		// no smoking symbol
		if (":u1f6ad:".equals(name) || ":no_smoking:".equals(name))
			return "1f6ad";
		// squared cjk unified ideograph-6708
		if (":u1f237:".equals(name) || ":u6708:".equals(name)) return "1f237";
		// squared cjk unified ideograph-7533
		if (":u1f238:".equals(name) || ":u7533:".equals(name)) return "1f238";
		// squared katakana sa
		if (":u1f202:".equals(name) || ":sa:".equals(name)) return "1f202";
		// circled latin capital letter m
		if (":u24c2:".equals(name) || ":m:".equals(name)) return "24c2";
		// passport control
		if (":u1f6c2:".equals(name) || ":passport_control:".equals(name))
			return "1f6c2";
		// baggage claim
		if (":u1f6c4:".equals(name) || ":baggage_claim:".equals(name))
			return "1f6c4";
		// left luggage
		if (":u1f6c5:".equals(name) || ":left_luggage:".equals(name))
			return "1f6c5";
		// customs
		if (":u1f6c3:".equals(name) || ":customs:".equals(name)) return "1f6c3";
		// circled ideograph accept
		if (":u1f251:".equals(name) || ":accept:".equals(name)) return "1f251";
		// circled ideograph secret
		if (":u3299:".equals(name) || ":secret:".equals(name)) return "3299";
		// circled ideograph congratulation
		if (":u3297:".equals(name) || ":congratulations:".equals(name))
			return "3297";
		// squared cl
		if (":u1f191:".equals(name) || ":cl:".equals(name)) return "1f191";
		// squared sos
		if (":u1f198:".equals(name) || ":sos:".equals(name)) return "1f198";
		// squared id
		if (":u1f194:".equals(name) || ":id:".equals(name)) return "1f194";
		// no entry sign
		if (":u1f6ab:".equals(name) || ":no_entry_sign:".equals(name))
			return "1f6ab";
		// no one under eighteen symbol
		if (":u1f51e:".equals(name) || ":underage:".equals(name))
			return "1f51e";
		// no mobile phones
		if (":u1f4f5:".equals(name) || ":no_mobile_phones:".equals(name))
			return "1f4f5";
		// do not litter symbol
		if (":u1f6af:".equals(name) || ":do_not_litter:".equals(name))
			return "1f6af";
		// non-potable water symbol
		if (":u1f6b1:".equals(name) || ":non-potable_water:".equals(name))
			return "1f6b1";
		// no bicycles
		if (":u1f6b3:".equals(name) || ":no_bicycles:".equals(name))
			return "1f6b3";
		// no pedestrians
		if (":u1f6b7:".equals(name) || ":no_pedestrians:".equals(name))
			return "1f6b7";
		// children crossing
		if (":u1f6b8:".equals(name) || ":children_crossing:".equals(name))
			return "1f6b8";
		// no entry
		if (":u26d4:".equals(name) || ":no_entry:".equals(name)) return "26d4";
		// eight spoked asterisk
		if (":u2733:".equals(name) || ":eight_spoked_asterisk:".equals(name))
			return "2733";
		// sparkle
		if (":u2747:".equals(name) || ":sparkle:".equals(name)) return "2747";
		// negative squared cross mark
		if (":u274e:".equals(name)
				|| ":negative_squared_cross_mark:".equals(name))
			return "274e";
		// white heavy check mark
		if (":u2705:".equals(name) || ":white_check_mark:".equals(name))
			return "2705";
		// eight pointed black star
		if (":u2734:".equals(name) || ":eight_pointed_black_star:".equals(name))
			return "2734";
		// heart decoration
		if (":u1f49f:".equals(name) || ":heart_decoration:".equals(name))
			return "1f49f";
		// squared vs
		if (":u1f19a:".equals(name) || ":vs:".equals(name)) return "1f19a";
		// vibration mode
		if (":u1f4f3:".equals(name) || ":vibration_mode:".equals(name))
			return "1f4f3";
		// mobile phone off
		if (":u1f4f4:".equals(name) || ":mobile_phone_off:".equals(name))
			return "1f4f4";
		// negative squared latin capital letter a
		if (":u1f170:".equals(name) || ":a:".equals(name)) return "1f170";
		// negative squared latin capital letter b
		if (":u1f171:".equals(name) || ":b:".equals(name)) return "1f171";
		// negative squared ab
		if (":u1f18e:".equals(name) || ":ab:".equals(name)) return "1f18e";
		// negative squared latin capital letter o
		if (":u1f17e:".equals(name) || ":o2:".equals(name)) return "1f17e";
		// diamond shape with a dot inside
		if (":u1f4a0:".equals(name)
				|| ":diamond_shape_with_a_dot_inside:".equals(name))
			return "1f4a0";
		// double curly loop
		if (":u27bf:".equals(name) || ":loop:".equals(name)) return "27bf";
		// black universal recycling symbol
		if (":u267b:".equals(name) || ":recycle:".equals(name)) return "267b";
		// aries
		if (":u2648:".equals(name) || ":aries:".equals(name)) return "2648";
		// taurus
		if (":u2649:".equals(name) || ":taurus:".equals(name)) return "2649";
		// gemini
		if (":u264a:".equals(name) || ":gemini:".equals(name)) return "264a";
		// cancer
		if (":u264b:".equals(name) || ":cancer:".equals(name)) return "264b";
		// leo
		if (":u264c:".equals(name) || ":leo:".equals(name)) return "264c";
		// virgo
		if (":u264d:".equals(name) || ":virgo:".equals(name)) return "264d";
		// libra
		if (":u264e:".equals(name) || ":libra:".equals(name)) return "264e";
		// scorpius
		if (":u264f:".equals(name) || ":scorpius:".equals(name)) return "264f";
		// sagittarius
		if (":u2650:".equals(name) || ":sagittarius:".equals(name))
			return "2650";
		// capricorn
		if (":u2651:".equals(name) || ":capricorn:".equals(name)) return "2651";
		// aquarius
		if (":u2652:".equals(name) || ":aquarius:".equals(name)) return "2652";
		// pisces
		if (":u2653:".equals(name) || ":pisces:".equals(name)) return "2653";
		// ophiuchus
		if (":u26ce:".equals(name) || ":ophiuchus:".equals(name)) return "26ce";
		// six pointed star with middle dot
		if (":u1f52f:".equals(name) || ":six_pointed_star:".equals(name))
			return "1f52f";
		// automated teller machine
		if (":u1f3e7:".equals(name) || ":atm:".equals(name)) return "1f3e7";
		// chart with upwards trend and yen sign
		if (":u1f4b9:".equals(name) || ":chart:".equals(name)) return "1f4b9";
		// heavy dollar sign
		if (":u1f4b2:".equals(name) || ":heavy_dollar_sign:".equals(name))
			return "1f4b2";
		// currency exchange
		if (":u1f4b1:".equals(name) || ":currency_exchange:".equals(name))
			return "1f4b1";
		// copyright sign
		if (":u00a9:".equals(name) || ":copyright:".equals(name)) return "00a9";
		// registered sign
		if (":u00ae:".equals(name) || ":registered:".equals(name))
			return "00ae";
		// trade mark sign
		if (":u2122:".equals(name) || ":tm:".equals(name)) return "2122";
		// cross mark
		if (":u274c:".equals(name) || ":x:".equals(name)) return "274c";
		// double exclamation mark
		if (":u203c:".equals(name) || ":bangbang:".equals(name)) return "203c";
		// exclamation question mark
		if (":u2049:".equals(name) || ":interrobang:".equals(name))
			return "2049";
		// heavy exclamation mark symbol
		if (":u2757:".equals(name) || ":exclamation:".equals(name)
				|| ":heavy_exclamation_mark:".equals(name))
			return "2757";
		// black question mark ornament
		if (":u2753:".equals(name) || ":question:".equals(name)) return "2753";
		// white exclamation mark ornament
		if (":u2755:".equals(name) || ":grey_exclamation:".equals(name))
			return "2755";
		// white question mark ornament
		if (":u2754:".equals(name) || ":grey_question:".equals(name))
			return "2754";
		// heavy large circle
		if (":u2b55:".equals(name) || ":o:".equals(name)) return "2b55";
		// top with upwards arrow above
		if (":u1f51d:".equals(name) || ":top:".equals(name)) return "1f51d";
		// end with leftwards arrow above
		if (":u1f51a:".equals(name) || ":end:".equals(name)) return "1f51a";
		// back with leftwards arrow above
		if (":u1f519:".equals(name) || ":back:".equals(name)) return "1f519";
		// on with exclamation mark with left right arrow above
		if (":u1f51b:".equals(name) || ":on:".equals(name)) return "1f51b";
		// soon with rightwards arrow above
		if (":u1f51c:".equals(name) || ":soon:".equals(name)) return "1f51c";
		// clockwise downwards and upwards open circle arrows
		if (":u1f503:".equals(name) || ":arrows_clockwise:".equals(name))
			return "1f503";
		// clock face twelve oclock
		if (":u1f55b:".equals(name) || ":clock12:".equals(name)) return "1f55b";
		// clock face twelve-thirty
		if (":u1f567:".equals(name) || ":clock1230:".equals(name))
			return "1f567";
		// clock face one oclock
		if (":u1f550:".equals(name) || ":clock1:".equals(name)) return "1f550";
		// clock face one-thirty
		if (":u1f55c:".equals(name) || ":clock130:".equals(name))
			return "1f55c";
		// clock face two oclock
		if (":u1f551:".equals(name) || ":clock2:".equals(name)) return "1f551";
		// clock face two-thirty
		if (":u1f55d:".equals(name) || ":clock230:".equals(name))
			return "1f55d";
		// clock face three oclock
		if (":u1f552:".equals(name) || ":clock3:".equals(name)) return "1f552";
		// clock face three-thirty
		if (":u1f55e:".equals(name) || ":clock330:".equals(name))
			return "1f55e";
		// clock face four oclock
		if (":u1f553:".equals(name) || ":clock4:".equals(name)) return "1f553";
		// clock face four-thirty
		if (":u1f55f:".equals(name) || ":clock430:".equals(name))
			return "1f55f";
		// clock face five oclock
		if (":u1f554:".equals(name) || ":clock5:".equals(name)) return "1f554";
		// clock face five-thirty
		if (":u1f560:".equals(name) || ":clock530:".equals(name))
			return "1f560";
		// clock face six oclock
		if (":u1f555:".equals(name) || ":clock6:".equals(name)) return "1f555";
		// clock face seven oclock
		if (":u1f556:".equals(name) || ":clock7:".equals(name)) return "1f556";
		// clock face eight oclock
		if (":u1f557:".equals(name) || ":clock8:".equals(name)) return "1f557";
		// clock face nine oclock
		if (":u1f558:".equals(name) || ":clock9:".equals(name)) return "1f558";
		// clock face ten oclock
		if (":u1f559:".equals(name) || ":clock10:".equals(name)) return "1f559";
		// clock face eleven oclock
		if (":u1f55a:".equals(name) || ":clock11:".equals(name)) return "1f55a";
		// clock face six-thirty
		if (":u1f561:".equals(name) || ":clock630:".equals(name))
			return "1f561";
		// clock face seven-thirty
		if (":u1f562:".equals(name) || ":clock730:".equals(name))
			return "1f562";
		// clock face eight-thirty
		if (":u1f563:".equals(name) || ":clock830:".equals(name))
			return "1f563";
		// clock face nine-thirty
		if (":u1f564:".equals(name) || ":clock930:".equals(name))
			return "1f564";
		// clock face ten-thirty
		if (":u1f565:".equals(name) || ":clock1030:".equals(name))
			return "1f565";
		// clock face eleven-thirty
		if (":u1f566:".equals(name) || ":clock1130:".equals(name))
			return "1f566";
		// heavy multiplication x
		if (":u2716:".equals(name) || ":heavy_multiplication_x:".equals(name))
			return "2716";
		// heavy plus sign
		if (":u2795:".equals(name) || ":heavy_plus_sign:".equals(name))
			return "2795";
		// heavy minus sign
		if (":u2796:".equals(name) || ":heavy_minus_sign:".equals(name))
			return "2796";
		// heavy division sign
		if (":u2797:".equals(name) || ":heavy_division_sign:".equals(name))
			return "2797";
		// black spade suit
		if (":u2660:".equals(name) || ":spades:".equals(name)) return "2660";
		// black heart suit
		if (":u2665:".equals(name) || ":hearts:".equals(name)) return "2665";
		// black club suit
		if (":u2663:".equals(name) || ":clubs:".equals(name)) return "2663";
		// black diamond suit
		if (":u2666:".equals(name) || ":diamonds:".equals(name)) return "2666";
		// white flower
		if (":u1f4ae:".equals(name) || ":white_flower:".equals(name))
			return "1f4ae";
		// hundred points symbol
		if (":u1f4af:".equals(name) || ":100:".equals(name)) return "1f4af";
		// heavy check mark
		if (":u2714:".equals(name) || ":heavy_check_mark:".equals(name))
			return "2714";
		// ballot box with check
		if (":u2611:".equals(name) || ":ballot_box_with_check:".equals(name))
			return "2611";
		// radio button
		if (":u1f518:".equals(name) || ":radio_button:".equals(name))
			return "1f518";
		// link symbol
		if (":u1f517:".equals(name) || ":link:".equals(name)) return "1f517";
		// curly loop
		if (":u27b0:".equals(name) || ":curly_loop:".equals(name))
			return "27b0";
		// wavy dash
		if (":u3030:".equals(name) || ":wavy_dash:".equals(name)) return "3030";
		// part alternation mark
		if (":u303d:".equals(name) || ":part_alternation_mark:".equals(name))
			return "303d";
		// trident emblem
		if (":u1f531:".equals(name) || ":trident:".equals(name)) return "1f531";
		// black medium square
		if (":u25fc:".equals(name) || ":black_medium_square:".equals(name))
			return "25fc";
		// white medium square
		if (":u25fb:".equals(name) || ":white_medium_square:".equals(name))
			return "25fb";
		// black medium small square
		if (":u25fe:".equals(name)
				|| ":black_medium_small_square:".equals(name))
			return "25fe";
		// white medium small square
		if (":u25fd:".equals(name)
				|| ":white_medium_small_square:".equals(name))
			return "25fd";
		// black small square
		if (":u25aa:".equals(name) || ":black_small_square:".equals(name))
			return "25aa";
		// white small square
		if (":u25ab:".equals(name) || ":white_small_square:".equals(name))
			return "25ab";
		// up-pointing red triangle
		if (":u1f53a:".equals(name) || ":small_red_triangle:".equals(name))
			return "1f53a";
		// black square button
		if (":u1f532:".equals(name) || ":black_square_button:".equals(name))
			return "1f532";
		// white square button
		if (":u1f533:".equals(name) || ":white_square_button:".equals(name))
			return "1f533";
		// medium black circle
		if (":u26ab:".equals(name) || ":black_circle:".equals(name))
			return "26ab";
		// medium white circle
		if (":u26aa:".equals(name) || ":white_circle:".equals(name))
			return "26aa";
		// large red circle
		if (":u1f534:".equals(name) || ":red_circle:".equals(name))
			return "1f534";
		// large blue circle
		if (":u1f535:".equals(name) || ":large_blue_circle:".equals(name))
			return "1f535";
		// down-pointing red triangle
		if (":u1f53b:".equals(name) || ":small_red_triangle_down:".equals(name))
			return "1f53b";
		// white large square
		if (":u2b1c:".equals(name) || ":white_large_square:".equals(name))
			return "2b1c";
		// black large square
		if (":u2b1b:".equals(name) || ":black_large_square:".equals(name))
			return "2b1b";
		// large orange diamond
		if (":u1f536:".equals(name) || ":large_orange_diamond:".equals(name))
			return "1f536";
		// large blue diamond
		if (":u1f537:".equals(name) || ":large_blue_diamond:".equals(name))
			return "1f537";
		// small orange diamond
		if (":u1f538:".equals(name) || ":small_orange_diamond:".equals(name))
			return "1f538";
		// small blue diamond
		if (":u1f539:".equals(name) || ":small_blue_diamond:".equals(name))
			return "1f539";
		return null;
	}

}
