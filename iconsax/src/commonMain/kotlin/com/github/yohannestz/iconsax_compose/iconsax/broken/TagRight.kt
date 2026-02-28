package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TagRight: ImageVector
    get() {
        val current = _tagRight
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.TagRight",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 4.22f, y = 3.1f)
                arcToRelative(a = 2.23f, b = 2.23f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.89f, dy1 = 3.41f)
                lineToRelative(dx = 2.77f, dy = 4.43f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 2.14f)
                lineToRelative(dx = -2.77f, dy = 4.43f)
                arcToRelative(a = 2.23f, b = 2.23f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.89f, dy1 = 3.41f)
                horizontalLineToRelative(dx = 10.45f)
                curveToRelative(dx1 = 0.61f, dy1 = 0.0f, dx2 = 1.41f, dy2 = -0.4f, dx3 = 1.78f, dy3 = -0.89f)
                lineToRelative(dx = 5.18f, dy = -6.9f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.1f, dy1 = -2.28f)
                lineToRelative(dx = -4.18f, dy = -6.68f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.89f, dy1 = -1.05f)
                horizontalLineToRelative(dx = -7.0f)
            }
        }.build().also { _tagRight = it }
    }

@Suppress("ObjectPropertyName")
private var _tagRight: ImageVector? = null
