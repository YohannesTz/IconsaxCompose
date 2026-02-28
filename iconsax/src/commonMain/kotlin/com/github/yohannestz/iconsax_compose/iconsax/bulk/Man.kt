package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Man: ImageVector
    get() {
        val current = _man
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Man",
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
                moveTo(x = 18.0f, y = 13.75f)
                arcTo(horizontalEllipseRadius = 7.75f, verticalEllipseRadius = 7.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, x1 = 10.25f, y1 = 6.0f)
                arcToRelative(a = 7.7f, b = 7.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.92f, dy1 = 1.77f)
                horizontalLineToRelative(dx = 0.01f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.05f, dy1 = 1.06f)
                arcTo(horizontalEllipseRadius = 7.7f, verticalEllipseRadius = 7.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 18.0f, y1 = 13.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.25f, y = 2.5f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 20.75f, y1 = 9.41f, x2 = 20.75f, y2 = 9.0f)
                verticalLineTo(y = 4.31f)
                lineToRelative(dx = -4.52f, dy = 4.52f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.05f, dy1 = -1.06f)
                lineToRelative(dx = 4.51f, dy = -4.52f)
                horizontalLineTo(x = 15.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 14.59f, y1 = 1.75f, x2 = 15.0f, y2 = 1.75f)
                horizontalLineToRelative(dx = 6.5f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.75f, dy1 = 0.75f)
            }
        }.build().also { _man = it }
    }

@Suppress("ObjectPropertyName")
private var _man: ImageVector? = null
