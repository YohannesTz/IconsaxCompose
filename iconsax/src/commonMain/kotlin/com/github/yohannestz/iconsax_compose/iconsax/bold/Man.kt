package com.github.yohannestz.iconsax_compose.iconsax.bold

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
            ) {
                moveTo(x = 22.19f, y = 2.21f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.4f, dy1 = -0.4f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.29f, dy1 = -0.06f)
                horizontalLineTo(x = 15.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = 0.34f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 14.59f, y1 = 3.25f, x2 = 15.0f, y2 = 3.25f)
                horizontalLineToRelative(dx = 4.69f)
                lineToRelative(dx = -4.51f, dy = 4.52f)
                horizontalLineToRelative(dx = -0.01f)
                arcTo(horizontalEllipseRadius = 7.7f, verticalEllipseRadius = 7.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 10.25f, y1 = 6.0f)
                arcTo(horizontalEllipseRadius = 7.75f, verticalEllipseRadius = 7.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, x1 = 18.0f, y1 = 13.75f)
                arcToRelative(a = 7.7f, b = 7.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.77f, dy1 = -4.92f)
                lineToRelative(dx = 4.52f, dy = -4.52f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = 0.34f, dy2 = 0.75f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 22.25f, y1 = 9.41f, x2 = 22.25f, y2 = 9.0f)
                verticalLineTo(y = 2.5f)
                quadToRelative(dx1 = 0.0f, dy1 = -0.15f, dx2 = -0.06f, dy2 = -0.29f)
            }
        }.build().also { _man = it }
    }

@Suppress("ObjectPropertyName")
private var _man: ImageVector? = null
