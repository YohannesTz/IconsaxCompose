package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CardSlash: ImageVector
    get() {
        val current = _cardSlash
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CardSlash",
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
                moveTo(x = 22.0f, y = 9.0f)
                verticalLineToRelative(dy = 7.46f)
                arcToRelative(a = 4.14f, b = 4.14f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.15f, dy1 = 4.14f)
                horizontalLineTo(x = 6.4f)
                lineToRelative(dx = 3.57f, dy = -3.57f)
                lineToRelative(dx = 1.28f, dy = -1.28f)
                lineTo(x = 18.0f, y = 9.0f)
                close()
                moveToRelative(dx = -7.0f, dy = 0.0f)
                lineTo(x = 4.0f, y = 20.0f)
                arcToRelative(a = 4.1f, b = 4.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.0f, dy1 = -3.54f)
                verticalLineTo(y = 9.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 7.54f)
                verticalLineTo(y = 9.0f)
                horizontalLineToRelative(dx = -4.0f)
                lineToRelative(dx = 3.47f, dy = -3.47f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 7.54f)
                moveTo(x = 20.0f, y = 4.0f)
                lineToRelative(dx = -5.0f, dy = 5.0f)
                horizontalLineTo(x = 2.0f)
                verticalLineTo(y = 7.54f)
                arcTo(horizontalEllipseRadius = 4.14f, verticalEllipseRadius = 4.14f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.15f, y1 = 3.4f)
                horizontalLineToRelative(dx = 11.7f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 20.0f, y1 = 4.0f)
                moveTo(x = 8.21f, y = 15.79f)
                lineToRelative(dx = -1.46f, dy = 1.46f)
                horizontalLineTo(x = 6.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 5.59f, y1 = 15.75f, x2 = 6.0f, y2 = 15.75f)
                horizontalLineToRelative(dx = 2.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.21f, dy1 = 0.04f)
                moveToRelative(dx = 7.04f, dy = 0.71f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
                horizontalLineToRelative(dx = -4.0f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = -0.22f)
                lineToRelative(dx = 1.28f, dy = -1.28f)
                horizontalLineToRelative(dx = 3.25f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.75f, dy1 = 0.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.77f, y = 2.23f)
                arcToRelative(a = 0.77f, b = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.1f, dy1 = 0.0f)
                lineTo(x = 2.24f, y = 20.69f)
                arcToRelative(a = 0.77f, b = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.09f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.08f, dy1 = -0.01f)
                lineTo(x = 21.77f, y = 3.3f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.08f)
            }
        }.build().also { _cardSlash = it }
    }

@Suppress("ObjectPropertyName")
private var _cardSlash: ImageVector? = null
