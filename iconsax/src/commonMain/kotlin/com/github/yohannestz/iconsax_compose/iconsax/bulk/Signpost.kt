package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Signpost: ImageVector
    get() {
        val current = _signpost
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Signpost",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.97f, y = 3.75f)
                verticalLineToRelative(dy = 3.5f)
                arcTo(horizontalEllipseRadius = 1.75f, verticalEllipseRadius = 1.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 17.22f, y1 = 9.0f)
                horizontalLineTo(x = 8.96f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.09f, dy1 = -0.38f)
                lineTo(x = 5.68f, y = 6.87f)
                arcToRelative(a = 1.76f, b = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -2.74f)
                lineToRelative(dx = 2.19f, dy = -1.75f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.96f, y1 = 2.0f)
                horizontalLineToRelative(dx = 8.26f)
                arcToRelative(a = 1.75f, b = 1.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.75f, dy1 = 1.75f)
                moveToRelative(dx = -0.63f, dy = 13.12f)
                lineToRelative(dx = -2.18f, dy = 1.75f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.1f, dy1 = 0.38f)
                horizontalLineTo(x = 6.8f)
                arcToRelative(a = 1.75f, b = 1.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.75f, dy1 = -1.75f)
                verticalLineToRelative(dy = -3.5f)
                arcTo(horizontalEllipseRadius = 1.75f, verticalEllipseRadius = 1.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.8f, y1 = 12.0f)
                horizontalLineToRelative(dx = 8.26f)
                quadToRelative(dx1 = 0.62f, dy1 = 0.01f, dx2 = 1.1f, dy2 = 0.38f)
                lineToRelative(dx = 2.18f, dy = 1.75f)
                arcToRelative(a = 1.75f, b = 1.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 2.74f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 12.75f, y = 9.0f)
                horizontalLineToRelative(dx = -1.5f)
                verticalLineToRelative(dy = 3.0f)
                horizontalLineToRelative(dx = 1.5f)
                close()
                moveToRelative(dx = 3.0f, dy = 13.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 15.0f, y1 = 22.75f)
                horizontalLineTo(x = 9.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 8.59f, y1 = 21.25f, x2 = 9.0f, y2 = 21.25f)
                horizontalLineToRelative(dx = 2.25f)
                verticalLineTo(y = 19.0f)
                horizontalLineToRelative(dx = 1.5f)
                verticalLineToRelative(dy = 2.25f)
                horizontalLineTo(x = 15.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 15.75f, y1 = 22.0f)
            }
        }.build().also { _signpost = it }
    }

@Suppress("ObjectPropertyName")
private var _signpost: ImageVector? = null
