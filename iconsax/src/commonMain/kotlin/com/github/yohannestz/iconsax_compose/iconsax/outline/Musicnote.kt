package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Musicnote: ImageVector
    get() {
        val current = _musicnote
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Musicnote",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 7.97f, y = 22.75f)
                arcToRelative(a = 4.75f, b = 4.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -9.5f)
                arcToRelative(a = 4.75f, b = 4.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 9.5f)
                moveToRelative(dx = 0.0f, dy = -8.0f)
                arcToRelative(a = 3.26f, b = 3.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 6.5f)
                arcTo(horizontalEllipseRadius = 3.26f, verticalEllipseRadius = 3.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 11.22f, y1 = 18.0f)
                arcToRelative(a = 3.25f, b = 3.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.25f, dy1 = -3.25f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.97f, y = 18.75f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.22f, y1 = 18.0f)
                verticalLineTo(y = 4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 12.72f, y1 = 3.59f, x2 = 12.72f, y2 = 4.0f)
                verticalLineToRelative(dy = 14.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.13f, y = 10.23f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.02f, dy1 = -0.17f)
                lineTo(x = 13.69f, y = 8.6f)
                arcToRelative(a = 3.8f, b = 3.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.46f, dy1 = -3.4f)
                verticalLineTo(y = 4.0f)
                arcToRelative(a = 2.8f, b = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.08f, dy1 = -2.3f)
                arcToRelative(a = 2.8f, b = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.53f, dy1 = -0.3f)
                lineToRelative(dx = 4.42f, dy = 1.46f)
                arcToRelative(a = 3.8f, b = 3.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.46f, dy1 = 3.41f)
                verticalLineToRelative(dy = 1.17f)
                arcToRelative(a = 2.8f, b = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.08f, dy1 = 2.31f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.51f, dy1 = 0.48f)
                moveToRelative(dx = -5.31f, dy = -7.5f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.63f, dy1 = 0.18f)
                quadToRelative(dx1 = -0.46f, dy1 = 0.33f, dx2 = -0.46f, dy2 = 1.1f)
                verticalLineToRelative(dy = 1.16f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.8f, dx2 = 0.67f, dy2 = 1.73f, dx3 = 1.43f, dy3 = 2.0f)
                lineToRelative(dx = 4.42f, dy = 1.46f)
                curveToRelative(dx1 = 0.46f, dy1 = 0.16f, dx2 = 0.89f, dy2 = 0.12f, dx3 = 1.18f, dy3 = -0.09f)
                curveToRelative(dx1 = 0.3f, dy1 = -0.2f, dx2 = 0.46f, dy2 = -0.6f, dx3 = 0.46f, dy3 = -1.09f)
                verticalLineTo(y = 6.28f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.8f, dx2 = -0.67f, dy2 = -1.73f, dx3 = -1.43f, dy3 = -1.99f)
                lineToRelative(dx = -4.42f, dy = -1.47f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.55f, dy1 = -0.1f)
            }
        }.build().also { _musicnote = it }
    }

@Suppress("ObjectPropertyName")
private var _musicnote: ImageVector? = null
