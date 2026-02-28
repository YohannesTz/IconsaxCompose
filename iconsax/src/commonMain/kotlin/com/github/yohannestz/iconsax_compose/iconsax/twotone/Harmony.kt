package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Harmony: ImageVector
    get() {
        val current = _harmony
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Harmony",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 5.74f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.7f, dx2 = -0.84f, dy2 = 3.3f, dx3 = -2.28f, dy3 = 4.2f)
                arcTo(horizontalEllipseRadius = 13.5f, verticalEllipseRadius = 13.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 14.0f, y1 = 11.88f)
                verticalLineTo(y = 5.74f)
                arcTo(horizontalEllipseRadius = 3.75f, verticalEllipseRadius = 3.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 17.74f, y1 = 2.0f)
                horizontalLineToRelative(dx = 0.52f)
                arcTo(horizontalEllipseRadius = 3.75f, verticalEllipseRadius = 3.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 5.74f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.4f,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 8.0f)
                verticalLineToRelative(dy = 10.26f)
                arcTo(horizontalEllipseRadius = 3.75f, verticalEllipseRadius = 3.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 18.26f, y1 = 22.0f)
                horizontalLineToRelative(dx = -0.52f)
                arcTo(horizontalEllipseRadius = 3.75f, verticalEllipseRadius = 3.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 14.0f, y1 = 18.26f)
                verticalLineToRelative(dy = -6.38f)
                curveTo(x1 = 19.58f, y1 = 11.23f, x2 = 22.0f, y2 = 8.0f, x3 = 22.0f, y3 = 8.0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.0f, y = 18.26f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.7f, dx2 = 0.84f, dy2 = -3.3f, dx3 = 2.28f, dy3 = -4.2f)
                arcTo(horizontalEllipseRadius = 13.5f, verticalEllipseRadius = 13.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 10.0f, y1 = 12.12f)
                verticalLineToRelative(dy = 6.14f)
                arcTo(horizontalEllipseRadius = 3.75f, verticalEllipseRadius = 3.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.26f, y1 = 22.0f)
                horizontalLineTo(x = 5.74f)
                arcTo(horizontalEllipseRadius = 3.75f, verticalEllipseRadius = 3.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 18.26f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.4f,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.0f, y = 16.0f)
                verticalLineTo(y = 5.74f)
                arcTo(horizontalEllipseRadius = 3.75f, verticalEllipseRadius = 3.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.74f, y1 = 2.0f)
                horizontalLineToRelative(dx = 0.52f)
                arcTo(horizontalEllipseRadius = 3.75f, verticalEllipseRadius = 3.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 10.0f, y1 = 5.74f)
                verticalLineToRelative(dy = 6.38f)
                curveTo(x1 = 4.42f, y1 = 12.77f, x2 = 2.0f, y2 = 16.0f, x3 = 2.0f, y3 = 16.0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 10.0f, y = 12.1f)
                quadToRelative(dx1 = 0.94f, dy1 = -0.1f, dx2 = 2.0f, dy2 = -0.1f)
                curveToRelative(dx1 = 1.06f, dy1 = 0.0f, dx2 = 1.37f, dy2 = -0.04f, dx3 = 2.0f, dy3 = -0.12f)
            }
        }.build().also { _harmony = it }
    }

@Suppress("ObjectPropertyName")
private var _harmony: ImageVector? = null
