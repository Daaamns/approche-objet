package fr.diginamic.annotations;

import java.lang.reflect.Field;

public class StringUtils {

    /**
     * Génère une chaîne de caractères basée sur l'annotation @ToString des attributs d'un objet.
     *
     * @param obj L'objet à analyser
     * @return Une chaîne de caractères formattée
     */
    public static String generateToString(Object obj) {
        StringBuilder sb = new StringBuilder();

        // Récupération des champs de la classe avec la réflexion
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(ToString.class)) {
                try {
                    field.setAccessible(true);
                    ToString annotation = field.getAnnotation(ToString.class);
                    Object value = field.get(obj);

                    if (value instanceof String && annotation.uppercase()) {
                        value = ((String) value).toUpperCase();
                    }

                    // Ajout du champ formaté avec séparateur
                    sb.append(value).append(annotation.separator()).append(" ");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        return sb.toString().trim(); // Supprime l'espace finale
    }
}
