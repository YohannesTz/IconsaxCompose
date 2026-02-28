package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Civic: ImageVector
    get() {
        val current = _civic
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Civic",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.4f,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 14.3f, y = 10.13f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.05f, dy1 = 2.64f)
                verticalLineToRelative(dy = 1.98f)
                arcToRelative(a = 1.25f, b = 1.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.5f, dy1 = 0.0f)
                verticalLineToRelative(dy = -1.98f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.13f, dy1 = -2.02f)
                arcToRelative(a = 2.38f, b = 2.38f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.68f, dy1 = -0.62f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 21.55f, y = 9.03f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = -0.01f, dy1 = 5.98f)
            }
        }.build().also { _civic = it }
    }

@Suppress("ObjectPropertyName")
private var _civic: ImageVector? = null
