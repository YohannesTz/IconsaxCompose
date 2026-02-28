package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EmojiHappy: ImageVector
    get() {
        val current = _emojiHappy
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.EmojiHappy",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.0f, y = 22.75f)
                horizontalLineTo(x = 9.0f)
                curveToRelative(dx1 = -5.43f, dy1 = 0.0f, dx2 = -7.75f, dy2 = -2.32f, dx3 = -7.75f, dy3 = -7.75f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.43f, dx2 = 2.32f, dy2 = -7.75f, dx3 = 7.75f, dy3 = -7.75f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 5.43f, dy1 = 0.0f, dx2 = 7.75f, dy2 = 2.32f, dx3 = 7.75f, dy3 = 7.75f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.43f, dx2 = -2.32f, dy2 = 7.75f, dx3 = -7.75f, dy3 = 7.75f)
                moveToRelative(dx = -6.0f, dy = -20.0f)
                curveTo(x1 = 4.39f, y1 = 2.75f, x2 = 2.75f, y2 = 4.39f, x3 = 2.75f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.61f, dx2 = 1.64f, dy2 = 6.25f, dx3 = 6.25f, dy3 = 6.25f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 4.61f, dy1 = 0.0f, dx2 = 6.25f, dy2 = -1.64f, dx3 = 6.25f, dy3 = -6.25f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.61f, dx2 = -1.64f, dy2 = -6.25f, dx3 = -6.25f, dy3 = -6.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.5f, y = 10.5f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -4.5f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 4.5f)
                moveToRelative(dx = 0.0f, dy = -3.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = 0.34f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 15.09f, y1 = 9.0f, x2 = 15.5f, y2 = 9.0f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = -0.34f, dx2 = 0.75f, dy2 = -0.75f)
                reflectiveCurveTo(x1 = 15.91f, y1 = 7.5f, x2 = 15.5f, y2 = 7.5f)
                moveToRelative(dx = -7.0f, dy = 3.0f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -4.5f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 4.5f)
                moveToRelative(dx = 0.0f, dy = -3.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = 0.34f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 8.09f, y1 = 9.0f, x2 = 8.5f, y2 = 9.0f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = -0.34f, dx2 = 0.75f, dy2 = -0.75f)
                reflectiveCurveTo(x1 = 8.91f, y1 = 7.5f, x2 = 8.5f, y2 = 7.5f)
                moveTo(x = 12.0f, y = 19.45f)
                arcToRelative(a = 5.26f, b = 5.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.25f, dy1 = -5.25f)
                arcToRelative(a = 1.65f, b = 1.65f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.65f, dy1 = -1.65f)
                horizontalLineToRelative(dx = 7.2f)
                arcToRelative(a = 1.65f, b = 1.65f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.65f, dy1 = 1.65f)
                arcTo(horizontalEllipseRadius = 5.26f, verticalEllipseRadius = 5.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 19.45f)
                moveToRelative(dx = -3.6f, dy = -5.4f)
                arcToRelative(a = 0.15f, b = 0.15f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.15f, dy1 = 0.15f)
                arcToRelative(a = 3.75f, b = 3.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 7.5f, dy1 = 0.0f)
                arcToRelative(a = 0.15f, b = 0.15f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.15f, dy1 = -0.15f)
                close()
            }
        }.build().also { _emojiHappy = it }
    }

@Suppress("ObjectPropertyName")
private var _emojiHappy: ImageVector? = null
