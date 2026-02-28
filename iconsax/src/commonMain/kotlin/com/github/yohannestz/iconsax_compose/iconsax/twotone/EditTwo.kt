package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EditTwo: ImageVector
    get() {
        val current = _editTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.EditTwo",
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
                moveTo(x = 13.26f, y = 3.6f)
                lineToRelative(dx = -8.21f, dy = 8.69f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.67f, dy1 = 1.43f)
                lineToRelative(dx = -0.37f, dy = 3.24f)
                curveToRelative(dx1 = -0.13f, dy1 = 1.17f, dx2 = 0.71f, dy2 = 1.97f, dx3 = 1.87f, dy3 = 1.77f)
                lineToRelative(dx = 3.22f, dy = -0.55f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.39f, dy1 = -0.75f)
                lineToRelative(dx = 8.21f, dy = -8.69f)
                curveToRelative(dx1 = 1.42f, dy1 = -1.5f, dx2 = 2.06f, dy2 = -3.21f, dx3 = -0.15f, dy3 = -5.3f)
                curveToRelative(dx1 = -2.2f, dy1 = -2.07f, dx2 = -3.87f, dy2 = -1.34f, dx3 = -5.29f, dy3 = 0.16f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 11.89f, y = 5.05f)
                arcToRelative(a = 6.1f, b = 6.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.45f, dy1 = 5.15f)
                moveTo(x = 3.0f, y = 22.0f)
                horizontalLineToRelative(dx = 18.0f)
            }
        }.build().also { _editTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _editTwo: ImageVector? = null
