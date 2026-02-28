package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Translate: ImageVector
    get() {
        val current = _translate
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Translate",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.79f, y = 19.42f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.33f, dy1 = -0.08f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.34f, dy1 = -1.01f)
                lineToRelative(dx = 2.14f, dy = -4.27f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.67f, dy1 = -0.41f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.67f, dy1 = 0.42f)
                lineToRelative(dx = 2.14f, dy = 4.27f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.34f, dy1 = 1.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.01f, dy1 = -0.33f)
                lineToRelative(dx = -1.46f, dy = -2.93f)
                lineTo(x = 15.47f, y = 19.0f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.68f, dy1 = 0.4f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.68f, y = 18.66f)
                horizontalLineToRelative(dx = -3.52f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 3.52f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.92f, y = 22.75f)
                arcToRelative(a = 5.83f, b = 5.83f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -11.66f)
                arcToRelative(a = 5.83f, b = 5.83f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 11.66f)
                moveToRelative(dx = 0.0f, dy = -10.15f)
                arcToRelative(a = 4.33f, b = 4.33f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 8.66f)
                arcToRelative(a = 4.33f, b = 4.33f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -8.66f)
                moveTo(x = 4.86f, y = 12.7f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.61f, dy1 = -0.91f)
                quadToRelative(dx1 = -1.0f, dy1 = -0.97f, dx2 = -1.0f, dy2 = -2.86f)
                verticalLineTo(y = 5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.43f, dx2 = 1.34f, dy2 = -3.77f, dx3 = 3.77f, dy3 = -3.77f)
                horizontalLineToRelative(dx = 3.92f)
                quadToRelative(dx1 = 1.88f, dy1 = 0.0f, dx2 = 2.86f, dy2 = 1.0f)
                quadToRelative(dx1 = 0.95f, dy1 = 0.98f, dx2 = 0.91f, dy2 = 2.79f)
                verticalLineToRelative(dy = 3.9f)
                quadToRelative(dx1 = 0.04f, dy1 = 1.84f, dx2 = -0.93f, dy2 = 2.83f)
                quadToRelative(dx1 = -0.98f, dy1 = 0.97f, dx2 = -2.85f, dy2 = 0.93f)
                horizontalLineTo(x = 4.86f)
                moveToRelative(dx = 0.16f, dy = -9.95f)
                curveToRelative(dx1 = -1.61f, dy1 = 0.0f, dx2 = -2.27f, dy2 = 0.66f, dx3 = -2.27f, dy3 = 2.27f)
                verticalLineToRelative(dy = 3.92f)
                quadToRelative(dx1 = 0.0f, dy1 = 1.25f, dx2 = 0.54f, dy2 = 1.78f)
                quadToRelative(dx1 = 0.52f, dy1 = 0.5f, dx2 = 1.7f, dy2 = 0.48f)
                horizontalLineToRelative(dx = 3.94f)
                quadToRelative(dx1 = 1.25f, dy1 = 0.03f, dx2 = 1.77f, dy2 = -0.5f)
                reflectiveQuadToRelative(dx1 = 0.49f, dy1 = -1.75f)
                verticalLineTo(y = 5.0f)
                quadToRelative(dx1 = 0.03f, dy1 = -1.2f, dx2 = -0.48f, dy2 = -1.72f)
                quadToRelative(dx1 = -0.53f, dy1 = -0.54f, dx2 = -1.78f, dy2 = -0.54f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 9.0f, y = 6.6f)
                horizontalLineTo(x = 4.94f)
                curveToRelative(dx1 = -0.4f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 4.53f, y1 = 5.1f, x2 = 4.94f, y2 = 5.1f)
                horizontalLineTo(x = 9.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 6.98f, y = 6.6f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineTo(y = 5.17f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.4f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 0.68f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.98f, y1 = 6.6f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 4.94f, y = 9.76f)
                curveToRelative(dx1 = -0.4f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                curveToRelative(dx1 = 1.27f, dy1 = 0.0f, dx2 = 2.3f, dy2 = -1.08f, dx3 = 2.3f, dy3 = -2.42f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.16f, dx2 = -1.7f, dy2 = 3.92f, dx3 = -3.8f, dy3 = 3.92f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 9.01f, y = 9.76f)
                arcToRelative(a = 3.1f, b = 3.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.45f, dy1 = -1.3f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.2f, dy1 = -0.9f)
                curveToRelative(dx1 = 0.34f, dy1 = 0.46f, dx2 = 0.79f, dy2 = 0.7f, dx3 = 1.25f, dy3 = 0.7f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.35f, dx3 = 0.75f, dy3 = 0.76f)
                reflectiveCurveTo(x1 = 9.42f, y1 = 9.76f, x2 = 9.01f, y2 = 9.76f)
                moveTo(x = 9.0f, y = 22.75f)
                arcTo(horizontalEllipseRadius = 7.76f, verticalEllipseRadius = 7.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 1.25f, y1 = 15.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 2.75f, y1 = 14.59f, x2 = 2.75f, y2 = 15.0f)
                arcToRelative(a = 6.26f, b = 6.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.83f, dy1 = 6.09f)
                lineToRelative(dx = -0.27f, dy = -0.45f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 1.29f, dy1 = -0.77f)
                lineToRelative(dx = 1.05f, dy = 1.75f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.01f, dy1 = 0.75f)
                arcTo(horizontalEllipseRadius = 0.8f, verticalEllipseRadius = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.0f, y1 = 22.75f)
                moveToRelative(dx = 13.0f, dy = -13.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 21.25f, y1 = 9.0f)
                arcToRelative(a = 6.26f, b = 6.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.83f, dy1 = -6.09f)
                lineToRelative(dx = 0.27f, dy = 0.45f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = -1.3f, dy1 = 0.77f)
                lineToRelative(dx = -1.04f, dy = -1.75f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.01f, dy1 = -0.75f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.65f, dy1 = -0.38f)
                arcTo(horizontalEllipseRadius = 7.76f, verticalEllipseRadius = 7.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.74f, y1 = 9.0f)
                arcTo(horizontalEllipseRadius = 0.74f, verticalEllipseRadius = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 9.75f)
            }
        }.build().also { _translate = it }
    }

@Suppress("ObjectPropertyName")
private var _translate: ImageVector? = null
