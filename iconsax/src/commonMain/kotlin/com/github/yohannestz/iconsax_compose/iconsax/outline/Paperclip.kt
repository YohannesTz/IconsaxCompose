package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Paperclip: ImageVector
    get() {
        val current = _paperclip
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Paperclip",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 10.97f, y = 22.75f)
                arcTo(horizontalEllipseRadius = 6.76f, verticalEllipseRadius = 6.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 4.22f, y1 = 16.0f)
                verticalLineToRelative(dy = -6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.27f, dx2 = 3.48f, dy2 = -7.75f, dx3 = 7.75f, dy3 = -7.75f)
                reflectiveCurveToRelative(dx1 = 7.75f, dy1 = 3.48f, dx2 = 7.75f, dy2 = 7.75f)
                verticalLineToRelative(dy = 5.5f)
                arcToRelative(a = 4.26f, b = 4.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.25f, dy1 = 4.25f)
                arcToRelative(a = 4.26f, b = 4.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.25f, dy1 = -4.25f)
                verticalLineTo(y = 12.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 3.5f)
                arcToRelative(a = 2.75f, b = 2.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 5.5f, dy1 = 0.0f)
                verticalLineTo(y = 10.0f)
                arcToRelative(a = 6.25f, b = 6.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -12.5f, dy1 = 0.0f)
                verticalLineToRelative(dy = 6.0f)
                arcToRelative(a = 5.26f, b = 5.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.25f, dy1 = 5.25f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
            }
        }.build().also { _paperclip = it }
    }

@Suppress("ObjectPropertyName")
private var _paperclip: ImageVector? = null
