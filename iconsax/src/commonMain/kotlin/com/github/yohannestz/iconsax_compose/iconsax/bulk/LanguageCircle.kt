package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LanguageCircle: ImageVector
    get() {
        val current = _languageCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.LanguageCircle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 12.0f, y = 22.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.0f, y = 15.97f)
                arcToRelative(a = 4.8f, b = 4.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.56f, dy1 = -1.71f)
                arcTo(horizontalEllipseRadius = 8.5f, verticalEllipseRadius = 8.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 15.2f, y1 = 9.7f)
                horizontalLineToRelative(dx = 1.78f)
                curveToRelative(dx1 = 0.4f, dy1 = 0.0f, dx2 = 0.75f, dy2 = -0.34f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 17.4f, y1 = 8.2f, x2 = 16.99f, y2 = 8.2f)
                horizontalLineToRelative(dx = -2.43f)
                lineTo(x = 14.5f, y = 8.19f)
                lineTo(x = 14.44f, y = 8.2f)
                horizontalLineToRelative(dx = -1.7f)
                verticalLineTo(y = 7.27f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = -0.33f, dy2 = -0.75f, dx3 = -0.74f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = 0.34f, dx2 = -0.75f, dy2 = 0.75f)
                verticalLineTo(y = 8.2f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = 0.34f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 6.6f, y1 = 9.7f, x2 = 7.0f, y2 = 9.7f)
                horizontalLineToRelative(dx = 6.69f)
                arcToRelative(a = 6.87f, b = 6.87f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -6.71f, dy1 = 6.27f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = 0.34f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = 0.75f, dx2 = 0.75f, dy2 = 0.75f)
                curveToRelative(dx1 = 2.07f, dy1 = 0.0f, dx2 = 3.96f, dy2 = -0.8f, dx3 = 5.4f, dy3 = -2.11f)
                arcToRelative(a = 6.3f, b = 6.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.6f, dy1 = 2.11f)
                curveToRelative(dx1 = 0.4f, dy1 = 0.0f, dx2 = 0.75f, dy2 = -0.34f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 17.4f, y1 = 15.97f, x2 = 17.0f, y2 = 15.97f)
            }
        }.build().also { _languageCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _languageCircle: ImageVector? = null
