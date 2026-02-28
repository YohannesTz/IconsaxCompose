package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LampSlash: ImageVector
    get() {
        val current = _lampSlash
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.LampSlash",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 20.03f, y = 2.48f)
                lineTo(x = 4.18f, y = 18.33f)
                moveTo(x = 13.6f, y = 2.17f)
                arcToRelative(a = 7.3f, b = 7.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.76f, dy1 = 2.18f)
                moveTo(x = 5.25f, y = 13.0f)
                arcTo(horizontalEllipseRadius = 7.9f, verticalEllipseRadius = 7.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.38f, y1 = 2.51f)
                moveToRelative(dx = 9.68f, dy = 4.79f)
                curveToRelative(dx1 = 1.22f, dy1 = 3.88f, dx2 = -0.75f, dy2 = 7.78f, dx3 = -3.54f, dy3 = 9.57f)
                verticalLineToRelative(dy = 1.16f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.29f, dx2 = 0.1f, dy2 = 0.96f, dx3 = -0.9f, dy3 = 0.96f)
                horizontalLineToRelative(dx = -5.2f)
                curveToRelative(dx1 = -1.03f, dy1 = 0.0f, dx2 = -0.9f, dy2 = -0.43f, dx3 = -0.9f, dy3 = -0.96f)
                verticalLineToRelative(dy = -1.16f)
                arcToRelative(a = 8.0f, b = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.36f, dy1 = -1.1f)
                moveTo(x = 8.5f, y = 22.0f)
                arcToRelative(a = 13.0f, b = 13.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 7.0f, dy1 = 0.0f)
            }
        }.build().also { _lampSlash = it }
    }

@Suppress("ObjectPropertyName")
private var _lampSlash: ImageVector? = null
